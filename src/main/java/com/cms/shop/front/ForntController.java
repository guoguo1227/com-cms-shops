package com.cms.shop.front;

import com.cms.shop.controller.BaseController;
import com.cms.shop.enums.CheckStatusEnum;
import com.cms.shop.enums.ShopStatusEnum;
import com.cms.shop.enums.ShopTypeEnum;
import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.BoardVo;
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

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
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

    @Autowired
    private KeywordService keywordService;

    @Autowired
    private FlashService flashService;

    @Autowired
    private AdvertService advertService;
    /**
     * 多条件搜索商铺
     * @return
     */
    @RequestMapping("search-shop")
    public String search(final SearchCondition condition,ModelMap modelMap,HttpServletRequest request){
        condition.setLimit(20); //每页20
        List<ShopVo> list = new ArrayList<>();
        int total = 0;
        int totalPage = 0;
        int pageSize = 0;
        int currentPage = 0;

        if(null != condition.getCurrentPage()){
            currentPage = condition.getCurrentPage();
        }

        try {
            String searchContent = new String(request.getParameter("searchContent").getBytes("ISO8859-1"), "UTF-8");
            condition.setSearchContent(searchContent);
        } catch (Exception e){
           logger.info("无搜索词");
        }

        //添加搜索词
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                keywordService.addKeyword(condition.getSearchContent());
            }
        });
        thread.start();

        condition.setCheckStatus(CheckStatusEnum.PASS.getKey());

        Page<ShopVo> shopVoPage = shopService.queryListBySearchCondition(condition);
        if(null != shopVoPage){
            list = shopVoPage.getPageData();
            total = shopVoPage.getTotalCount();
            totalPage = shopVoPage.getTotalPage();
            pageSize = shopVoPage.getPageSize();
        }
        List<Hotcategory> hotcategoryList = hotcategoryService.queryAll();
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD);
        List<District> districtList = districtService.queryAll();
        List<Keyword> keywordList = keywordService.queryHotKeyWord();

        Flash flash = flashService.queryFlash();
        modelMap.addAttribute("flash",flash);

        Advert advert = null;
        condition.setLimit(1);
        if(null != condition.getType()){
            if(condition.getType().equals(3)){
                condition.setType(3); //位置3
            }else if(condition.getType().equals(2)){
                condition.setType(4); //位置4
            }
        }else{
            condition.setType(3);
        }

        List<Advert> advertList = advertService.queryOnlineList(condition);
        if(CollectionUtils.isNotEmpty(advertList)){
            advert = advertList.get(0);
        }
        modelMap.addAttribute("districtList", districtList);//地区
        modelMap.addAttribute("keywordList",keywordList);
        modelMap.addAttribute("advert",advert);
        modelMap.addAttribute("total",total);
        modelMap.addAttribute("totalPage",totalPage);
        modelMap.addAttribute("pageSize",pageSize);
        modelMap.addAttribute("currentPage",currentPage);
        modelMap.addAttribute("shopList",list);
        modelMap.addAttribute("goodShopList",goodShopList);
        modelMap.addAttribute("hotcategoryList",hotcategoryList);//商铺类型
        modelMap.addAttribute("searchContent",condition.getSearchContent());

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

        List<Keyword> keywordList = keywordService.queryHotKeyWord();
        Flash flash = flashService.queryFlash();
        modelMap.addAttribute("flash",flash);
        Advert advert = null;
        condition.setLimit(1);
        condition.setType(9); //位置9
        List<Advert> advertList = advertService.queryOnlineList(condition);
        if(CollectionUtils.isNotEmpty(advertList)){
            advert = advertList.get(0);
        }

        modelMap.addAttribute("keywordList",keywordList);
        modelMap.addAttribute("shop",vo);
        modelMap.addAttribute("advert",advert);
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

        List<Business> businessList = new ArrayList<>();
        Business business = null;
        if(null != condition.getId()){
            Page<Business> page = businessService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                business = page.getPageData().get(0);
            }
        }
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD);
        List<District> districtList = districtService.queryAll();
        List<Keyword> keywordList = keywordService.queryHotKeyWord();
        Flash flash = flashService.queryFlash();
        modelMap.addAttribute("flash",flash);

        Advert advert = null;
        condition.setLimit(1);
        condition.setType(10); //位置10
        List<Advert> advertList = advertService.queryOnlineList(condition);
        if(CollectionUtils.isNotEmpty(advertList)){
            advert = advertList.get(0);
        }

        modelMap.addAttribute("districtList",districtList);//地区
        modelMap.addAttribute("keywordList",keywordList);
        modelMap.addAttribute("advert",advert);

        modelMap.addAttribute("business",business);
        modelMap.addAttribute("goodShopList",goodShopList);

        return "project";
    }

    /**
     * 北翼资讯列表
     * @param condition
     * @param modelMap
     * @return
     */
    @RequestMapping("boardList")
    public String BoardList(SearchCondition condition,ModelMap modelMap){

        List<BoardVo> boardList = new ArrayList<>();
        int total = 0;
        int totalPage = 0;
        int pageSize = 0;
        int currentPage = 0;

        if(null != condition.getCurrentPage()){
            currentPage = condition.getCurrentPage();
        }
        condition.setCheckStatus(CheckStatusEnum.PASS.getKey());
        Page<BoardVo> page = boardService.queryPageByCondition(condition);
        if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
            boardList = page.getPageData();
            total = page.getTotalCount();
            totalPage = page.getTotalPage();
            pageSize = page.getPageSize();
        }
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD);
        List<District> districtList = districtService.queryAll();
        List<Keyword> keywordList = keywordService.queryHotKeyWord();
        Flash flash = flashService.queryFlash();
        modelMap.addAttribute("flash",flash);

        Advert advert = null;
        condition.setLimit(1);
        condition.setType(5); //位置5
        List<Advert> advertList = advertService.queryOnlineList(condition);
        if(CollectionUtils.isNotEmpty(advertList)){
            advert = advertList.get(0);
        }

        modelMap.addAttribute("districtList",districtList);//地区
        modelMap.addAttribute("keywordList",keywordList);
        modelMap.addAttribute("advert",advert);

        modelMap.addAttribute("boardList",boardList);
        modelMap.addAttribute("goodShopList",goodShopList);
        modelMap.addAttribute("total",total);
        modelMap.addAttribute("totalPage",totalPage);
        modelMap.addAttribute("pageSize",pageSize);
        modelMap.addAttribute("currentPage",currentPage);

        return "boardList";
    }

    /**
     * 北翼资讯详情列表
     * @param condition
     * @param modelMap
     * @return
     */
    @RequestMapping("boardDetail")
    public String BoardDetail(SearchCondition condition,ModelMap modelMap){

        BoardVo board = null;
        Page<BoardVo> page = boardService.queryPageByCondition(condition);
        if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
            board = page.getPageData().get(0);
        }
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD);
        List<District> districtList = districtService.queryAll();
        List<Keyword> keywordList = keywordService.queryHotKeyWord();

        Flash flash = flashService.queryFlash();
        modelMap.addAttribute("flash",flash);
        Advert advert = null;
        condition.setLimit(1);
        condition.setType(8); //位置8
        List<Advert> advertList = advertService.queryOnlineList(condition);
        if(CollectionUtils.isNotEmpty(advertList)){
            advert = advertList.get(0);
        }
        modelMap.addAttribute("districtList",districtList);//地区
        modelMap.addAttribute("keywordList",keywordList);
        modelMap.addAttribute("advert",advert);

        modelMap.addAttribute("board",board);
        modelMap.addAttribute("goodShopList",goodShopList);
        return "boardDetail";
    }

    /**
     * 关于我们
     * @param condition
     * @param modelMap
     * @return
     */
    @RequestMapping("aboutme")
    public String aboutme(SearchCondition condition,ModelMap modelMap){

        List<Business> businessList = new ArrayList<>();
        Page<Business> page = businessService.queryPageByCondition(condition);
        if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
            businessList = page.getPageData();
        }
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD);
        List<District> districtList = districtService.queryAll();
        List<Keyword> keywordList = keywordService.queryHotKeyWord();

        Advert advert = null;
        condition.setLimit(1);
        condition.setType(7); //位置7
        List<Advert> advertList = advertService.queryOnlineList(condition);
        if(CollectionUtils.isNotEmpty(advertList)){
            advert = advertList.get(0);
        }

        Flash flash = flashService.queryFlash();
        modelMap.addAttribute("flash",flash);
        modelMap.addAttribute("districtList",districtList);//地区
        modelMap.addAttribute("keywordList",keywordList);
        modelMap.addAttribute("advert",advert);

        modelMap.addAttribute("businessList",businessList);
        modelMap.addAttribute("goodShopList",goodShopList);

        return "aboutme";
    }

    /**
     * 精品项目
     * @param condition
     * @param modelMap
     * @return
     */
    @RequestMapping("manage")
    public String manage(SearchCondition condition,ModelMap modelMap){

        List<Business> businessList = new ArrayList<>();
        Page<Business> page = businessService.queryPageByCondition(condition);
        if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
            businessList = page.getPageData();
        }
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD);
        List<District> districtList = districtService.queryAll();
        List<Keyword> keywordList = keywordService.queryHotKeyWord();

        Advert advert = null;
        condition.setLimit(1);
        condition.setType(6); //位置6
        List<Advert> advertList = advertService.queryOnlineList(condition);
        if(CollectionUtils.isNotEmpty(advertList)){
            advert = advertList.get(0);
        }

        Flash flash = flashService.queryFlash();
        modelMap.addAttribute("flash",flash);
        modelMap.addAttribute("districtList",districtList);//地区
        modelMap.addAttribute("keywordList",keywordList);
        modelMap.addAttribute("advert",advert);

        modelMap.addAttribute("businessList",businessList);
        modelMap.addAttribute("goodShopList",goodShopList);

        return "manage";
    }


}
