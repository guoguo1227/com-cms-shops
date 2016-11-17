package com.cms.shop.front;

import com.cms.shop.controller.BaseController;
import com.cms.shop.enums.ShopTypeEnum;
import com.cms.shop.model.base.Business;
import com.cms.shop.model.base.District;
import com.cms.shop.model.base.Hotcategory;
import com.cms.shop.model.base.ShopImg;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.service.*;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-12
 */
@Controller
@RequestMapping("front")
public class ForntController extends BaseController{

    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private PartnerService partnerService;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private ShopService shopService;

    @Autowired
    private BoardService boardService;

    @Autowired
    private HotcategoryService hotcategoryService;

    @Autowired
    private ShopImgService shopImgService;

    @Autowired
    private DistrictService districtService;

    /**
     * 多条件搜索商铺
     * @return
     */
    @RequestMapping("search-shop")
    public String search(SearchCondition condition,ModelMap modelMap){
        condition.setLimit(20); //每页20
        List<ShopVo> list = new ArrayList<>();
        int total = 0;
        int totalPage = 0;
        Page<ShopVo> shopVoPage = shopService.queryListBySearchCondition(condition);
        if(null != shopVoPage){
            list = shopVoPage.getPageData();
            total = shopVoPage.getTotalCount();
            totalPage = shopVoPage.getTotalPage();
        }
        List<Hotcategory> hotcategoryList = hotcategoryService.queryAll();
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD);

        modelMap.addAttribute("total",total);
        modelMap.addAttribute("pageSize",totalPage);
        modelMap.addAttribute("shopList",list);
        modelMap.addAttribute("goodShopList",goodShopList);
        modelMap.addAttribute("hotcategoryList",hotcategoryList);//商铺类型

        return "search";
    }

    /**
     * 商铺详情
     * @param condition
     * @param modelMap
     * @return
     */
    @RequestMapping("detail")
    public String detail(SearchCondition condition,ModelMap modelMap){

        ShopVo vo = null;
        List<ShopImg> imgList = null;
        if(null != condition.getId()){
            Page<ShopVo> shopVoPage = shopService.queryListBySearchCondition(condition);
            if(null != shopVoPage && CollectionUtils.isNotEmpty(shopVoPage.getPageData())){
                vo = shopVoPage.getPageData().get(0);
            }

            imgList = shopImgService.getImgListByShopId(condition.getId());
        }
        List<Hotcategory> hotcategoryList = hotcategoryService.queryAll();
        List<District> districtList = districtService.queryAll();

        modelMap.addAttribute("shop",vo);
        modelMap.addAttribute("imgList",imgList);
        modelMap.addAttribute("hotcategoryList",hotcategoryList);//商铺类型
        modelMap.addAttribute("districtList",districtList);//地区

        return "detail";
    }

    /**
     * 精品项目
     * @param condition
     * @param modelMap
     * @return
     */
    @RequestMapping("project")
    public String project(SearchCondition condition,ModelMap modelMap){

        Business business = null;
        Page<Business> page = businessService.queryPageByCondition(condition);
        if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
            business = page.getPageData().get(0);
        }
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD);

        modelMap.addAttribute("business",business);
        modelMap.addAttribute("goodShopList",goodShopList);

        return "project";
    }
}
