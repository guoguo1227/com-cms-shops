package com.cms.shop.index;

import com.cms.shop.controller.BaseController;
import com.cms.shop.model.base.Qa;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.QAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-12-3
 */
@Controller
@RequestMapping("shopIndex")
public class ShopIndexController extends BaseController{
    private final static Logger logger = LoggerFactory.getLogger(ShopIndexController.class);

    @Autowired
    private QAService qaService;

    /**
     * 添加评论
     * @param qa
     * @return
     */
    @RequestMapping("addComment")
    public String addComment(Qa qa){
        RequestResult result = new RequestResult();
        if(null != qa){
           result =  qaService.add(qa);
        }
        return gson.toJson(result);
    }

}
