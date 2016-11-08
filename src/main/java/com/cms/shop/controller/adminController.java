package com.cms.shop.controller;

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

    /**
     * 后台首页
     * @return
     */
    @RequestMapping("admin")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("test","test");
        return "index";
    }
}
