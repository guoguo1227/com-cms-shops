package com.cms.shop.front;

import com.cms.shop.controller.BaseController;
import com.cms.shop.model.condition.SearchCondition;
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
public class IndexController extends BaseController{

    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    /**
     * 首页
     * @return
     */
    @RequestMapping("index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("test","test");
        return "index";
    }

}
