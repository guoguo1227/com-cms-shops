package com.cms.shop.controller;

import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.QaVo;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.model.ext.StreetVo;
import com.cms.shop.service.*;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-6
 */

@Controller
@RequestMapping("shopmanage")
public class ShopManageController extends BaseController{

    @Autowired
    private ArchitectureService architectureService;

    @Autowired
    private BuildingFacilityService buildingFacilityService;

    @Autowired
    private BuildingFinishingService buildingFinishingService;

    @Autowired
    private BuildingOccupancyService buildingOccupancyService;

    @Autowired
    private DistrictService districtService;

    @Autowired
    private HotcategoryService hotcategoryService;

    @Autowired
    private StreetService streetService;

    @Autowired
    private ShopTypeService shopTypeService;

    @Autowired
    private FriendService friendService;

    @Autowired
    private PartnerService partnerService;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private FlashService flashService;

    @Autowired
    private QAService qaService;

    @RequestMapping("architPage")
    @ResponseBody
    public String queryArchitPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Architecture> page =  architectureService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("archit-all")
    @ResponseBody
    public String queryArchitAll(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        List<Architecture> list = architectureService.queryAll();
        if(CollectionUtils.isNotEmpty(list)){
            result.setSuccess(true);
            result.setData(list);
        }
        return gson.toJson(result);
    }
    @RequestMapping("buildFaciPage")
    @ResponseBody
    public String queryBuildFaciPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<BuildingFacility> page =  buildingFacilityService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }
    @RequestMapping("buildFaciAll")
    @ResponseBody
    public String queryBuildFaciAll(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){

            List<BuildingFacility> list = buildingFacilityService.queryAll();
            if(CollectionUtils.isNotEmpty(list)){
                result.setSuccess(true);
                result.setData(list);
            }
        }
        return gson.toJson(result);
    }
    @RequestMapping("buildFinishPage")
    @ResponseBody
    public String queryBuildFinishPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<BuildingFinishing> page =  buildingFinishingService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("buildFinish-all")
    @ResponseBody
    public String queryAllBuildFinish(){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        List<BuildingFinishing> list =  buildingFinishingService.queryAll();
        result.setSuccess(true);
        result.setData(list);
        return gson.toJson(result);
    }

    @RequestMapping("buildOccupPage")
    @ResponseBody
    public String queryBuildOccupPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<BuildingOccupancy> page =  buildingOccupancyService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("buildOccup-all")
    @ResponseBody
    public String queryAllOccupPage(){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        List<BuildingOccupancy> list =  buildingOccupancyService.queryAll();
        result.setSuccess(true);
        result.setData(list);
        return gson.toJson(result);
    }
    @RequestMapping("districtPage")
    @ResponseBody
    public String queryDistrictPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<District> page =  districtService.queryListByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 查询所有地区
     * @return
     */
    @RequestMapping("district-all")
    @ResponseBody
    public String queryAllDistrict(){
        RequestResult result = new RequestResult();
        result.setSuccess(true);
        List<District> list = districtService.queryAll();
        result.setData(list);
        return gson.toJson(result);
    }

    @RequestMapping("hotcatePage")
    @ResponseBody
    public String queryHotcatePage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Hotcategory> page =  hotcategoryService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 查询所有的所属商铺类型
     * @return
     */
    @RequestMapping("hotcate-all")
    @ResponseBody
    public String queryAllHotcate(){

        RequestResult result = new RequestResult();
        result.setSuccess(true);
        List<Hotcategory> list =  hotcategoryService.queryAll();

        result.setData(list);
        return gson.toJson(result);
    }

    @RequestMapping("shopTypePage")
    @ResponseBody
    public String queryShopTypePage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<ShopType> page =  shopTypeService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("shopType-all")
    @ResponseBody
    public String queryShopTypeAll(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            List<ShopType> list = shopTypeService.queryAll();
            if(CollectionUtils.isNotEmpty(list)){
                result.setData(list);
                result.setSuccess(true);
            }
        }
        return gson.toJson(result);
    }
    @RequestMapping("streetPage")
    @ResponseBody
    public String queryStreetPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<StreetVo> page =  streetService.queryVoByCondtion(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("street-list")
    @ResponseBody
    public String queryStreetList(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<StreetVo> page =  streetService.queryVoByCondtion(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page.getPageData());
            }
        }
        return gson.toJson(result);
    }

    /**
     * 获取所有街道
     * @return
     */
    @RequestMapping("street-all")
    @ResponseBody
    public String queryStreetAll(){

        RequestResult result = new RequestResult();
        result.setSuccess(true);
        List<Street> list = streetService.queryAll();
        result.setData(list);
        return gson.toJson(result);
    }

    @RequestMapping("friendPage")
    @ResponseBody
    public String queryFriendPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Friend> page =  friendService.queryListByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 获取合作伙伴列表
     * @param condition
     * @return
     */
    @RequestMapping("partnerPage")
    @ResponseBody
    public String queryPartnerPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Partner> page =  partnerService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 获取招商项目列表
     * @param condition
     * @return
     */
    @RequestMapping("businessPage")
    @ResponseBody
    public String queryBusinessPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Business> page =  businessService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 获取Flash列表
     * @param condition
     * @return
     */
    @RequestMapping("flashPage")
    @ResponseBody
    public String queryFlashPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Flash> page =  flashService.queryListByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 获取留言列表
     * @param condition
     * @return
     */
    @RequestMapping("qaPage")
    @ResponseBody
    public String queryQaPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<QaVo> page =  qaService.queryQAPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }
}
