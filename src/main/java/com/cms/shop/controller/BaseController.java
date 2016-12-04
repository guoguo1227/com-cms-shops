package com.cms.shop.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description : 控制器基类
 * Author : guo
 * Date : 2016/1/17 23:41
 */
public class BaseController {

    public Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    protected String getUserName(){
        String username = "";
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if(null != attrs){
            HttpServletRequest request = attrs.getRequest();
            if(null != request){
                username = request.getSession().getAttribute("SessionAdminUser").toString();
            }
        }
        return username;
    }
}
