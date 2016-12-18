package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.FlashMapper;
import com.cms.shop.enums.ImageType;
import com.cms.shop.enums.OnlineStatusEnum;
import com.cms.shop.model.base.Flash;
import com.cms.shop.model.base.FlashCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.FlashService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-11
 */
@Service
public class FlashServiceImpl implements FlashService{

    @Autowired
    private FlashMapper flashMapper;

    @Override
    public Page<Flash> queryListByCondition(SearchCondition condition) {
        Page<Flash> page = null;
        if(null != condition){
            page = new Page<>();
            page.setPageSize(condition.getLimit());

            FlashCriteria criteria = new FlashCriteria();
            criteria.setOrderByClause(" id desc ");
            int count = flashMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Flash> flashList = flashMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(flashList)){
                    for(Flash flash : flashList){
                        if(!StringUtils.isBlank(flash.getFlashName())){
                            if(flash.getFlashName().contains(ImageType.FLASH.getImagePath())){

                            }else{
                                flash.setFlashName(ImageType.FLASH.getImagePath()+flash.getFlashName());
                            }
                        }
                    }
                    page.setPageData(flashList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public Flash queryFlash() {

        Flash flash = null;
        FlashCriteria cri = new FlashCriteria();
        cri.createCriteria().andStatusEqualTo(1);
        cri.setOrderByClause(" id desc ");
        List<Flash> list = flashMapper.selectByExample(cri);
        if(CollectionUtils.isNotEmpty(list)){
            flash = list.get(0);
            if(flash.getFlashName().contains(ImageType.FLASH.getImagePath())){

            }else{
                flash.setFlashName(ImageType.FLASH.getImagePath()+flash.getFlashName());
            }
        }
        return flash;
    }

    @Override
    public RequestResult offlineFlash(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            Flash flash = flashMapper.selectByPrimaryKey(id);
            if(null != flash){
                flash.setStatus(OnlineStatusEnum.OFFLINE.getKey()); //下架
                int i = flashMapper.updateByPrimaryKeySelective(flash);
                if(i>0){
                    success = true;
                }
            }

        }else{
            message = "id不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult onlineFlash(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            Flash flash = flashMapper.selectByPrimaryKey(id);
            if(null != flash){
                flash.setStatus(OnlineStatusEnum.ONLINE.getKey()); //上架
                int i = flashMapper.updateByPrimaryKeySelective(flash);
                if(i>0){
                    success = true;
                }
            }

        }else{
            message = "id不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult addFlash(Flash flash) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != flash){
            //默认未上架
            flash.setStatus(OnlineStatusEnum.OFFLINE.getKey());
            int i  = flashMapper.insertSelective(flash);
            if(i>0){
                success = true;
            }

        }else{
            message = "flash不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult deleteFlash(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            int i = flashMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }else{
            message = "id不可为空!";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }


}
