package com.cms.shop.controller;

import com.cms.shop.model.ext.CommentVo;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.QAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : samuel
 * @Description : 留言板
 * @Date : 16-11-10
 */
@Controller
@RequestMapping("comment")
public class CommentController extends BaseController{
    private static final Logger logger = LoggerFactory.getLogger(CommentController.class);

    @Autowired
    private QAService qaService;

    @RequestMapping("add")
    @ResponseBody
    public String addComment(CommentVo comment){
        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != comment){
            //todo
        }
        return gson.toJson(result);
    }

    //删除留言
    @RequestMapping("delete")
    @ResponseBody
    public String deleteComment(Integer id){
        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            result = qaService.delete(id);
        }else{
            result.setMessage("id不可为空!");
        }
        return gson.toJson(result);
    }

}
