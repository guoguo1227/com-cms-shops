package com.cms.shop.service.impl;

import com.cms.shop.dao.base.ext.ShopPvExtMapper;
import com.cms.shop.dao.base.mapper.ShopPvMapper;
import com.cms.shop.enums.ShopPVEnum;
import com.cms.shop.enums.ShopTypeEnum;
import com.cms.shop.model.base.Shop;
import com.cms.shop.model.base.ShopPv;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.ShopPvExt;
import com.cms.shop.model.ext.Statistic;
import com.cms.shop.service.ShopService;
import com.cms.shop.service.StatisticService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by samuel on 17-1-9.
 */
@Service
public class StatisticServiceImpl implements StatisticService {

    private final static Logger logger = LoggerFactory.getLogger(StatisticServiceImpl.class);

    @Autowired
    private ShopPvMapper shopPvMapper;

    @Autowired
    private ShopService shopService;

    @Autowired
    private ShopPvExtMapper shopPvExtMapper;

    @Override
    public Object[] queryListByCondition(SearchCondition condition) {
        Object[] obj = new Object[10];
        if(null != condition){
            obj = queryByStatistic(condition);
        }
        return obj;
    }


    private Object[] queryByStatistic(SearchCondition condition){

        Map<String,Statistic> map = new HashMap<>();
        Object[] statisticList = new Object[10];
        List<ShopPvExt> shopClickTotal = new ArrayList<>();
        List<ShopPvExt> shopFireClickTotal = new ArrayList<>();
        List<ShopPvExt> shopGoodClickTotal = new ArrayList<>();
        List<ShopPvExt> shopBusinessList = new ArrayList<>();
        List<ShopPvExt> shopAdList = new ArrayList<>();
        List<ShopPvExt> shopQQList = new ArrayList<>();
        List<ShopPvExt> shopQAList = new ArrayList<>();
        //月
        if(condition.getType() == 1){
            shopClickTotal = shopPvExtMapper.queryClickMonthByType(ShopPVEnum.SHOP.getKey());
            shopFireClickTotal = shopPvExtMapper.queryClickMonthByTypeAndRelate(ShopPVEnum.SHOP.getKey(), ShopTypeEnum.FIRE.getKey());
            shopGoodClickTotal = shopPvExtMapper.queryClickMonthByTypeAndRelate(ShopPVEnum.SHOP.getKey(), ShopTypeEnum.GOOD.getKey());

            //电子商铺点击数
            shopBusinessList = shopPvExtMapper.queryClickMonthByType(ShopPVEnum.BUSINESS.getKey());
            //广告点击数
            shopAdList = shopPvExtMapper.queryClickMonthByType(ShopPVEnum.AD.getKey());
            //在线客服
            shopQQList = shopPvExtMapper.queryQaMonthByType();
            //留言
            shopQAList = shopPvExtMapper.queryQaMonthByType();
        }else if(condition.getType() == 2){
            //周
            //商铺点击数
            shopClickTotal = shopPvExtMapper.queryClickWeekByType(ShopPVEnum.SHOP.getKey());
            shopFireClickTotal = shopPvExtMapper.queryClickWeekByTypeAndRelate(ShopPVEnum.SHOP.getKey(), ShopTypeEnum.FIRE.getKey());
            shopGoodClickTotal = shopPvExtMapper.queryClickWeekByTypeAndRelate(ShopPVEnum.SHOP.getKey(),ShopTypeEnum.GOOD.getKey());

            //电子商铺点击数
            shopBusinessList = shopPvExtMapper.queryClickWeekByType(ShopPVEnum.BUSINESS.getKey());
            //广告点击数
            shopAdList = shopPvExtMapper.queryClickWeekByType(ShopPVEnum.AD.getKey());
            //在线客服
            shopQQList = shopPvExtMapper.queryQaWeekByType();
            //留言
            shopQAList = shopPvExtMapper.queryQaWeekByType();
        }

        if(CollectionUtils.isNotEmpty(shopClickTotal)){
            for(ShopPvExt ext : shopClickTotal){
                Statistic statistic = new Statistic();
                statistic.setDate(ext.getDate());
                statistic.setShopClickTotal(ext.getCount().toString());
                map.put(ext.getDate(),statistic);
            }
        }
        if(CollectionUtils.isNotEmpty(shopFireClickTotal)){
            for(ShopPvExt ext : shopFireClickTotal){
                Statistic statistic = map.get(ext.getDate());
                if(null != statistic){
                    statistic.setShopFireClick(ext.getCount().toString());
                }else{
                    statistic = new Statistic();
                    statistic.setDate(ext.getDate());
                    statistic.setShopFireClick(ext.getCount().toString());
                }
                //更新
                map.put(ext.getDate(),statistic);
            }
        }
        if(CollectionUtils.isNotEmpty(shopGoodClickTotal)){
            for(ShopPvExt ext : shopGoodClickTotal){
                Statistic statistic = map.get(ext.getDate());
                if(null != statistic){
                    statistic.setShopGoodClick(ext.getCount().toString());
                }else{
                    statistic = new Statistic();
                    statistic.setDate(ext.getDate());
                    statistic.setShopGoodClick(ext.getCount().toString());
                }
                //更新
                map.put(ext.getDate(),statistic);
            }
        }
        if(CollectionUtils.isNotEmpty(shopBusinessList)){
            for(ShopPvExt ext : shopBusinessList){
                Statistic statistic = map.get(ext.getDate());
                if(null != statistic){
                    statistic.setBusinessClick(ext.getCount().toString());
                }else{
                    statistic = new Statistic();
                    statistic.setDate(ext.getDate());
                    statistic.setBusinessClick(ext.getCount().toString());
                }
                //更新
                map.put(ext.getDate(),statistic);
            }
        }
        if(CollectionUtils.isNotEmpty(shopAdList)){
            for(ShopPvExt ext : shopAdList){
                Statistic statistic = map.get(ext.getDate());
                if(null != statistic){
                    statistic.setAdClick(ext.getCount().toString());
                }else{
                    statistic = new Statistic();
                    statistic.setDate(ext.getDate());
                    statistic.setAdClick(ext.getCount().toString());
                }
                //更新
                map.put(ext.getDate(),statistic);
            }
        }
        if(CollectionUtils.isNotEmpty(shopQQList)){
            for(ShopPvExt ext : shopQQList){
                Statistic statistic = map.get(ext.getDate());
                if(null != statistic){
                    statistic.setQqClick(ext.getCount().toString());
                }else{
                    statistic = new Statistic();
                    statistic.setDate(ext.getDate());
                    statistic.setQqClick(ext.getCount().toString());
                }
                //更新
                map.put(ext.getDate(),statistic);
            }
        }
        if(CollectionUtils.isNotEmpty(shopQAList)){
            for(ShopPvExt ext : shopQAList){
                Statistic statistic = map.get(ext.getDate());
                if(null != statistic) {
                    statistic.setQaClick(ext.getCount().toString());
                }else{
                    statistic = new Statistic();
                    statistic.setDate(ext.getDate());
                    statistic.setQaClick(ext.getCount().toString());
                }
                //更新
                map.put(ext.getDate(),statistic);
            }
        }

        if(map.values().size()>0){
            statisticList = map.values().toArray();
            Arrays.sort(statisticList);
        }
        return statisticList;
    }

    @Override
    public void addShopPV(ShopPv shopPv) {
        if(null != shopPv){
            shopPv.setCreateDate(new Date());
            //热铺旺铺
            if(null != shopPv.getType()){
                if(shopPv.getType().equals(ShopPVEnum.SHOP.getKey())){
                    if(null != shopPv.getRelateId()){
                        Shop shop = shopService.queryShopById(shopPv.getRelateId());
                        if(null != shop){
                            shopPv.setRelateType(shop.getType());
                        }
                    }
                }
            }

            int i = shopPvMapper.insertSelective(shopPv);
            if(i>0){
                logger.info("成功添加relateid:"+shopPv.getRelateId()+",类型为:"+shopPv.getType()+"的点击统计");
            }
        }
    }
}
