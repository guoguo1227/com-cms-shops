package com.cms.shop.controller;

import com.cms.shop.enums.ShopTypeEnum;
import com.cms.shop.model.base.Shop;
import com.cms.shop.model.base.SysUser;
import com.cms.shop.model.base.SysUserCriteria;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.service.ShopService;
import com.cms.shop.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-18
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController{

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private ShopService shopService;

    @RequestMapping("login")
    @ResponseBody
    public String login(HttpServletRequest request,String username,String password){
        RequestResult result = sysUserService.login(username,password);
        //登陆成功
        if(result.getSuccess()){
            request.getSession().setAttribute("SessionAdminUser",username);
        }
        return gson.toJson(result);
    }

    /**
     * 登出
     * @param request
     * @return
     */
    @RequestMapping("loginout")
    @ResponseBody
    public String loginout(HttpServletRequest request){
        RequestResult result = new RequestResult();
        result.setSuccess(true);
        request.getSession().invalidate();
        return gson.toJson(result);
    }
}
