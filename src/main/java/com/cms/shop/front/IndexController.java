package com.cms.shop.front;

import com.cms.shop.controller.BaseController;
import com.cms.shop.enums.BoardTypeEnum;
import com.cms.shop.enums.ShopTypeEnum;
import com.cms.shop.model.base.Board;
import com.cms.shop.model.base.Business;
import com.cms.shop.model.base.Hotcategory;
import com.cms.shop.model.base.Partner;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.service.*;
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

    @Autowired
    private BoardService boardService;

    @Autowired
    private HotcategoryService hotcategoryService;

    /**
     * 首页
     * @return
     */
    @RequestMapping("index")
    public String index(ModelMap modelMap){

        List<Partner> partnerList =  partnerService.getOnList();

        List<Business> businessList = businessService.getOnList();
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD);
        List<ShopVo> fireShopList = shopService.getOnList(ShopTypeEnum.FIRE);

        List<Board> newsBoardList = boardService.queryOnList(BoardTypeEnum.NOTICE);
        List<Board> businessBoardList = boardService.queryOnList(BoardTypeEnum.SHOPABIT);

        List<Hotcategory> hotcategoryList = hotcategoryService.queryAll();

        modelMap.addAttribute("test","test");
        modelMap.addAttribute("partnerList",partnerList); //合作伙伴
        modelMap.addAttribute("businessList",businessList); //招商项目
        modelMap.addAttribute("goodShopList",goodShopList); //精选好铺
        modelMap.addAttribute("fireShopList",fireShopList); //精选旺铺
        modelMap.addAttribute("newsBoardList",newsBoardList); //北冀要闻
        modelMap.addAttribute("businessBoardList",businessBoardList); //商家动态
        modelMap.addAttribute("hotcategoryList",hotcategoryList);//商铺类型
        return "index";
    }

}
