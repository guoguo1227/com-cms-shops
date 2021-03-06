package com.cms.shop.front;

import com.cms.shop.controller.BaseController;
import com.cms.shop.enums.BoardTypeEnum;
import com.cms.shop.enums.ShopPVEnum;
import com.cms.shop.enums.ShopTypeEnum;
import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.BoardVo;
import com.cms.shop.model.ext.HotcategoryVo;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
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

    @Autowired
    private DistrictService districtService;

    @Autowired
    private FlashService flashService;

    @Autowired
    private KeywordService keywordService;

    @Autowired
    private AdvertService advertService;

    @Autowired
    private FriendService friendService;

    @Autowired
    private AboutmeService aboutmeService;

    @Autowired
    private StatisticService statisticService;
    /**
     * 首页
     * @return
     */
    @RequestMapping("index")
    public String index(ModelMap modelMap){

        List<Partner> partnerList =  partnerService.getOnList();

        List<Business> businessList = businessService.getOnList();
        List<ShopVo> goodShopList = shopService.getOnList(ShopTypeEnum.GOOD,6);
        List<ShopVo> fireShopList = shopService.getOnList(ShopTypeEnum.FIRE,6);

        SearchCondition condition = new SearchCondition();
        condition.setLimit(8);
        List<Board> newsBoardList = boardService.queryOnList(BoardTypeEnum.NEWS,condition);
        List<Board> businessBoardList = boardService.queryOnList(BoardTypeEnum.BUSINESS,condition);

        condition.setLimit(4);
        condition.setType(1);
        List<BoardVo> imgBoardList = boardService.queryVoOnList(null, condition);

        List<HotcategoryVo> hotcategoryList = hotcategoryService.queryHotNac();
        List<Hotcategory> hotAllList = hotcategoryService.querySearchHot();

        List<District> districtList = districtService.queryAll();

        condition.setLimit(4);
        condition.setType(1); //位置1
        List<Advert> advertTopList = advertService.queryOnlineList(condition); //顶部导航轮播广告图片

        condition.setLimit(3);
        condition.setType(2); //位置2
        List<Advert> advertList = advertService.queryOnlineList(condition);

        Flash flash = flashService.queryFlash();
        condition.setLimit(6);
        List<Friend> friendList = friendService.queryOnList(condition);

        List<Keyword> keywordList = keywordService.queryHotKeyWord();

        //招商热线
        Investment investment = shopService.queryInvestment();

        List<Aboutme> aboutmeList =  aboutmeService.queryAllList(condition);

        //添加点击数
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ShopPv pv = new ShopPv();
                pv.setType(ShopPVEnum.SITE.getKey());
                statisticService.addShopPV(pv);
            }
        });
        thread.start();
        modelMap.addAttribute("partnerList",partnerList); //合作伙伴
        modelMap.addAttribute("businessList",businessList); //招商项目
        modelMap.addAttribute("goodShopList",goodShopList); //精选好铺
        modelMap.addAttribute("fireShopList",fireShopList); //精选旺铺
        modelMap.addAttribute("newsBoardList",newsBoardList); //北翼要闻
        modelMap.addAttribute("businessBoardList",businessBoardList); //商家动态
        modelMap.addAttribute("imgBoardList",imgBoardList); //商家动态
        modelMap.addAttribute("hotcategoryList",hotcategoryList);//商铺类型
        modelMap.addAttribute("hotAllList",hotAllList);//商铺类型
        modelMap.addAttribute("districtList",districtList);//地区
        modelMap.addAttribute("flash",flash);
        modelMap.addAttribute("keywordList",keywordList);
        modelMap.addAttribute("today",new Date());
        modelMap.addAttribute("advertList",advertList); //广告
        modelMap.addAttribute("advertTopList",advertTopList); //广告
        modelMap.addAttribute("friendList",friendList); //友情链接
        modelMap.addAttribute("investment",investment); //招商热线
        modelMap.addAttribute("aboutmeList",aboutmeList); //关于我们
        return "index";
    }
}
