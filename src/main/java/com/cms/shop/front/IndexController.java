package com.cms.shop.front;

import com.cms.shop.controller.BaseController;
import com.cms.shop.enums.ShopTypeEnum;
import com.cms.shop.model.base.Business;
import com.cms.shop.model.base.Partner;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.service.BusinessService;
import com.cms.shop.service.PartnerService;
import com.cms.shop.service.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-7
 */

@Controller
@RequestMapping("")
public class IndexController extends BaseController{

    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private PartnerService partnerService;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private ShopService shopService;

    /**
     * 首页
     * @return
     */
    @RequestMapping("index")
    public String index(ModelMap modelMap){

        List<Partner> partnerList =  partnerService.getOnList();

        List<Business> businessList = businessService.getOnList();
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD);

        modelMap.addAttribute("test","test");
        modelMap.addAttribute("partnerList",partnerList); //合作伙伴
        modelMap.addAttribute("businessList",businessList); //招商项目
        modelMap.addAttribute("goodShopList",goodShopList); //精选好铺
        return "index";
    }

}
