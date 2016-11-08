package com.cms.shop.controller;

import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.service.ShopService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-5
 */
@Controller
@RequestMapping("shop")
public class ShopController extends BaseController{

    @Autowired
    private ShopService shopService;

    @RequestMapping("page")
    @ResponseBody
    public String queryPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<ShopVo> page =  shopService.queryListBySearchCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 审核列表
     * @param condition
     * @return
     */
    @RequestMapping("checkPage")
    @ResponseBody
    public String queryCheckPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<ShopVo> page =  shopService.queryListBySearchCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }
}
