package com.cms.shop.controller;

import com.cms.shop.model.base.Advert;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.AdvertService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-7
 */
@Controller
@RequestMapping("advert")
public class AdvertController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(AdvertController.class);

    @Autowired
    private AdvertService advertService;

    @RequestMapping("page")
    @ResponseBody
    public String queryAdvertPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Advert> page =  advertService.queryAdvertPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("query")
    @ResponseBody
    public String queryAdById(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            result =  advertService.queryAdvertById(id);
        }
        return gson.toJson(result);
    }

    @RequestMapping("delete")
    @ResponseBody
    public String deleteAdById(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            result =  advertService.deleteAdvertById(id);
        }
        return gson.toJson(result);
    }

    @RequestMapping("update")
    @ResponseBody
    public String updateAd(Advert advert){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != advert && null != advert.getAdId()){
            result =  advertService.updateAdvert(advert);
        }else{
            result.setMessage("广告id不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 审核广告
     * @param id
     * @param ifPass
     * @return
     */
    @RequestMapping("check")
    @ResponseBody
    public String checkAd(Integer id,boolean ifPass){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            result =  advertService.checkAdvert(id,ifPass);
        }
        return gson.toJson(result);
    }

    /**
     * 添加广告
     * @param advert
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public String addAd(Advert advert){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != advert && null != advert.getAdLoc() && !StringUtils.isBlank(advert.getNewPicName())){
            advert.setCreater(getUserName());
            result = advertService.addAdvert(advert);
        }else{
            result.setMessage("广告位置和广告图片不可为空!");
        }
        return gson.toJson(result);
    }
}

