package com.cms.shop.controller;

import com.cms.shop.enums.ImageType;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.upload.Repository;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;

/**
 * Description : 文件上传
 * Author : guo
 * Date : 2016/1/17 18:05
 */
@Controller
@RequestMapping("image")
public class UploadController extends BaseController{
    @Autowired
    private Repository repository;
    /**
     * Logger log
     */
    private static final Logger log = LoggerFactory.getLogger(UploadController.class);

    /**
     * uploadImages
     *
     * @param file     待上传的图片对象
     * @param request  用户请求对象
     * @描述: 图片上传
     */

    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public
    @ResponseBody

    Object uploadImages(Integer imageType, @RequestParam(value = "file", required = false) MultipartFile file,
                      HttpServletRequest request) {
        boolean flag = false;
        String fileUrl = null;
        String originName = file.getOriginalFilename();
        String ext = FilenameUtils.getExtension(originName).toLowerCase(Locale.ENGLISH);

        //暂时使用原文件名，作为上传后文件的名称
        String filename = originName;
        if(null == imageType) imageType=1;

        try {
           // String ctx = request.getContextPath();
            fileUrl = repository.storeByExt(ImageType.getImagePath(imageType), ext, file);
            flag = true;
        } catch (IllegalStateException e) {
            log.error("Upload images error: " + e.getMessage());
        } catch (IOException e) {
            log.error("Upload images error: " + e.getMessage());
        } finally {
            if (flag) {
                File f = new File(fileUrl);
                if (!f.exists())
                    f.mkdirs();
                if (!file.isEmpty()) {
                    try {
                        FileOutputStream fos = new FileOutputStream(fileUrl + filename);
                        InputStream in = file.getInputStream();
                        int b = 0;
                        while ((b = in.read()) != -1) {
                            fos.write(b);
                        }
                        fos.close();
                        in.close();
                    } catch (Exception e) {
                        log.error(e.getMessage());
                    }
                }
                log.info("上传成功。");
            }
        }
        RequestResult result = new RequestResult();
        result.setSuccess(true);
        JSONObject object = new JSONObject();
        object.put("uploadPath",fileUrl);
        result.setData(object);
        return  gson.toJson(result);
    }

    public static String uEditorUpload(HttpServletRequest request){
        String action = request.getParameter("action");
        if(!StringUtils.isEmpty(action)&&action.equalsIgnoreCase("uploadimage")){
            try {
                DiskFileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                List<FileItem> fileItems = upload.parseRequest(request);
                for(FileItem item : fileItems){
                    if(item.getName()!=null){
                        String fileName = item.getName();
                        String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toUpperCase();
                        File destFile = File.createTempFile("/tmp/"+System.currentTimeMillis() + "", "." + fileExt);
                        item.write(destFile);
                        String fileURL = "" ;
                        return "{\"original\":\""+fileName+"\",\"name\":\""+fileURL+"\",\"url\":\""+"http://www.lagou.com"+"/"+fileURL+"\",\"size\":\""+item.getSize()+"\",\"type\":\""+fileExt+"\",\"state\":\"SUCCESS\"}";
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch (FileUploadException e) {
                e.printStackTrace();
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }
        return "{\"imageActionName\":\"uploadimage\",\"imageFieldName\":\"upfile\",\"imageMaxSize\":2048000,\"imageAllowFiles\":[\".png\",\".jpg\",\".jpeg\",\".gif\",\".bmp\"],\"imageCompressEnable\":true,\"imageCompressBorder\":1600,\"imageInsertAlign\":\"none\",\"imageUrlPrefix\":\"\",\"imagePathFormat\":\"\\/server\\/ueditor\\/upload\\/image\\/{yyyy}{mm}{dd}\\/{time}{rand:6}\",\"scrawlActionName\":\"uploadscrawl\",\"scrawlFieldName\":\"upfile\",\"scrawlPathFormat\":\"\\/server\\/ueditor\\/upload\\/image\\/{yyyy}{mm}{dd}\\/{time}{rand:6}\",\"scrawlMaxSize\":2048000,\"scrawlUrlPrefix\":\"\",\"scrawlInsertAlign\":\"none\",\"snapscreenActionName\":\"uploadimage\",\"snapscreenPathFormat\":\"\\/server\\/ueditor\\/upload\\/image\\/{yyyy}{mm}{dd}\\/{time}{rand:6}\",\"snapscreenUrlPrefix\":\"\",\"snapscreenInsertAlign\":\"none\",\"catcherLocalDomain\":[\"127.0.0.1\",\"localhost\",\"img.baidu.com\"],\"catcherActionName\":\"catchimage\",\"catcherFieldName\":\"source\",\"catcherPathFormat\":\"\\/server\\/ueditor\\/upload\\/image\\/{yyyy}{mm}{dd}\\/{time}{rand:6}\",\"catcherUrlPrefix\":\"\",\"catcherMaxSize\":2048000,\"catcherAllowFiles\":[\".png\",\".jpg\",\".jpeg\",\".gif\",\".bmp\"],\"videoActionName\":\"uploadvideo\",\"videoFieldName\":\"upfile\",\"videoPathFormat\":\"\\/server\\/ueditor\\/upload\\/video\\/{yyyy}{mm}{dd}\\/{time}{rand:6}\",\"videoUrlPrefix\":\"\",\"videoMaxSize\":102400000,\"videoAllowFiles\":[\".flv\",\".swf\",\".mkv\",\".avi\",\".rm\",\".rmvb\",\".mpeg\",\".mpg\",\".ogg\",\".ogv\",\".mov\",\".wmv\",\".mp4\",\".webm\",\".mp3\",\".wav\",\".mid\"],\"fileActionName\":\"uploadfile\",\"fileFieldName\":\"upfile\",\"filePathFormat\":\"\\/server\\/ueditor\\/upload\\/file\\/{yyyy}{mm}{dd}\\/{time}{rand:6}\",\"fileUrlPrefix\":\"\",\"fileMaxSize\":51200000,\"fileAllowFiles\":[\".png\",\".jpg\",\".jpeg\",\".gif\",\".bmp\",\".flv\",\".swf\",\".mkv\",\".avi\",\".rm\",\".rmvb\",\".mpeg\",\".mpg\",\".ogg\",\".ogv\",\".mov\",\".wmv\",\".mp4\",\".webm\",\".mp3\",\".wav\",\".mid\",\".rar\",\".zip\",\".tar\",\".gz\",\".7z\",\".bz2\",\".cab\",\".iso\",\".doc\",\".docx\",\".xls\",\".xlsx\",\".ppt\",\".pptx\",\".pdf\",\".txt\",\".md\",\".xml\"],\"imageManagerActionName\":\"listimage\",\"imageManagerListPath\":\"\\/server\\/ueditor\\/upload\\/image\\/\",\"imageManagerListSize\":20,\"imageManagerUrlPrefix\":\"\",\"imageManagerInsertAlign\":\"none\",\"imageManagerAllowFiles\":[\".png\",\".jpg\",\".jpeg\",\".gif\",\".bmp\"],\"fileManagerActionName\":\"listfile\",\"fileManagerListPath\":\"\\/server\\/ueditor\\/upload\\/file\\/\",\"fileManagerUrlPrefix\":\"\",\"fileManagerListSize\":20,\"fileManagerAllowFiles\":[\".png\",\".jpg\",\".jpeg\",\".gif\",\".bmp\",\".flv\",\".swf\",\".mkv\",\".avi\",\".rm\",\".rmvb\",\".mpeg\",\".mpg\",\".ogg\",\".ogv\",\".mov\",\".wmv\",\".mp4\",\".webm\",\".mp3\",\".wav\",\".mid\",\".rar\",\".zip\",\".tar\",\".gz\",\".7z\",\".bz2\",\".cab\",\".iso\",\".doc\",\".docx\",\".xls\",\".xlsx\",\".ppt\",\".pptx\",\".pdf\",\".txt\",\".md\",\".xml\"]}";
    }
}
