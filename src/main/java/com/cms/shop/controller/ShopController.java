package com.cms.shop.controller;

import com.cms.shop.model.base.Investment;
import com.cms.shop.model.base.Shop;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.model.ext.ShopExt;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.service.ShopService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
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
     * 根据id查询商铺
     * @param id
     * @return
     */
    @RequestMapping("byId")
    @ResponseBody
    public String queryShopById(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            Shop shop = shopService.queryShopById(id);
            if(null != shop){
                result.setSuccess(true);
                result.setData(shop);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 查询商铺详情
     * @param id
     * @return
     */
    @RequestMapping("detail")
    @ResponseBody
    public String queryShopDetail(Integer id){
        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            ShopExt ext = shopService.queryShopDetailById(id);
            if(null != ext){
                result.setSuccess(true);
                result.setData(ext);
            }
        }
        return gsonDate.toJson(result);
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


    /**
     * 添加商铺
     * @param ext
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public String addShop(ShopExt ext){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != ext){
            result = shopService.addShop(ext);
        }
        return gson.toJson(result);
    }

    /**
     * 更新商铺
     * @param shop
     * @return
     */
    @RequestMapping("update")
    @ResponseBody
    public String updateShop(Shop shop){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != shop && null != shop.getId()){
            result = shopService.updateShop(shop);
        }else{
            result.setMessage("商铺id不可为空,请刷新页面重试!");
        }
        return gson.toJson(result);
    }
    /**
     * 更新商铺类型
     * @param id
     * @param type
     * @return
     */
    @RequestMapping("update-type")
    @ResponseBody
    public String updateShopType(Integer id,Integer type){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            result = shopService.updateShopType(id, type);
        }
        return gson.toJson(result);
    }

    /**
     * 更新商铺类型
     * @param id
     * @param road
     * @return
     */
    @RequestMapping("update-road")
    @ResponseBody
    public String updateRoad(Integer id,String road){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id && !StringUtils.isBlank(road)){
            result = shopService.updateRoad(id,road);
        }
        return gson.toJson(result);
    }

    /**
     * 审核商铺
     * @param id
     * @param ifPass
     * @return
     */
    @RequestMapping("check")
    @ResponseBody
    public String checkShop(Integer id,boolean ifPass){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            result = shopService.checkShop(id,ifPass);
        }
        return gson.toJson(result);
    }

    /**
     * 查询招商热线
     * @return
     */
    @RequestMapping("query-investment")
    @ResponseBody
    public String queryInvestment(){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        Investment investment = shopService.queryInvestment();
        if(null != investment){
            result.setSuccess(true);
            result.setData(investment);
        }
        return gson.toJson(result);
    }

    /**
     * 更新招商热线
     * @param investment
     * @return
     */
    @RequestMapping("update-investment")
    @ResponseBody
    public String updateInvestment(Investment investment){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        result = shopService.updateInvestment(investment);
        return gson.toJson(result);
    }

}
