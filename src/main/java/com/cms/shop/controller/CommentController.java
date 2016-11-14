package com.cms.shop.controller;

import com.cms.shop.model.ext.CommentVo;
import com.cms.shop.model.ext.RequestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @RequestMapping("add")
    @ResponseBody
    public String addComment(CommentVo comment){
        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != comment){

        }
        return gson.toJson(result);
    }

}
