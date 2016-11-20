package com.cms.shop.controller;

import com.cms.shop.model.ext.RequestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-7
 */
@Controller
public class adminController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(adminController.class);

    /**
     * 后台首页
     * @return
     */
    @RequestMapping("admin")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("test","test");
        return "index";
    }

 /*   *//**
     * 后台首页
     * @return
     *//*
    @RequestMapping("login")
    public String loginValidate(){
        RequestResult result = new RequestResult();
        result.setSuccess(true);
        return gson.toJson(result);
    }*/
}
