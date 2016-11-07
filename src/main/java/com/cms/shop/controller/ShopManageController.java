package com.cms.shop.controller;

import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.model.ext.StreetVo;
import com.cms.shop.service.*;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
