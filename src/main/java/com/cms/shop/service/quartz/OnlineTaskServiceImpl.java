package com.cms.shop.service.quartz;

import com.cms.shop.dao.base.mapper.BusinessMapper;
import com.cms.shop.enums.CheckStatusEnum;
import com.cms.shop.enums.OnlineStatusEnum;
import com.cms.shop.model.base.Business;
import com.cms.shop.model.base.BusinessCriteria;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by samuel on 16-12-18.
 */
@Service
public class OnlineTaskServiceImpl implements OnlineTaskService{

    private static final Logger logger = LoggerFactory.getLogger(OnlineTaskServiceImpl.class);

    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public void start() {
        logger.info("定时开始扫描待上架招商项目");
        Date now = new Date();
        onlineTask(now);
        offlineTask(now);
        logger.info("定时结束扫描待上架招商项目");
    }

    public void onlineTask(Date now){
        BusinessCriteria criteria = new BusinessCriteria();
        criteria.createCriteria().andAudStatusEqualTo(CheckStatusEnum.PASS.getKey()).andBizStatusEqualTo(OnlineStatusEnum.WAIT.getKey()).andOnsellDateGreaterThanOrEqualTo(now);//待上架

        List<Business> businessList = businessMapper.selectByExample(criteria);
        if(CollectionUtils.isNotEmpty(businessList)){
            for(Business business : businessList){
                business.setBizStatus(OnlineStatusEnum.ONLINE.getKey());
                int i = businessMapper.updateByPrimaryKeySelective(business);
                if(i>0){
                    logger.info("成功上架招商项目:"+business.getBizId());
                }
            }
        }
    }

    public void offlineTask(Date now){
        BusinessCriteria criteria = new BusinessCriteria();
        criteria.createCriteria().andAudStatusEqualTo(CheckStatusEnum.PASS.getKey()).andBizStatusEqualTo(OnlineStatusEnum.ONLINE.getKey()).andOffsellDateLessThan(now);

        List<Business> businessList = businessMapper.selectByExample(criteria);
        if(CollectionUtils.isNotEmpty(businessList)){
            for(Business business : businessList){
                business.setBizStatus(OnlineStatusEnum.OFFLINE.getKey());
                int i = businessMapper.updateByPrimaryKeySelective(business);
                if(i>0){
                    logger.info("成功下架招商项目:"+business.getBizId());
                }
            }
        }
    }
}
