package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.BusinessMapper;
import com.cms.shop.enums.CheckStatusEnum;
import com.cms.shop.enums.ImageType;
import com.cms.shop.enums.OnlineStatusEnum;
import com.cms.shop.model.base.Business;
import com.cms.shop.model.base.BusinessCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.BusinessService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-9
 */

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List<Business> getOnList() {
        BusinessCriteria criteria = new BusinessCriteria();
        criteria.createCriteria().andAudStatusEqualTo(CheckStatusEnum.PASS.getKey()).andBizStatusEqualTo(OnlineStatusEnum.ONLINE.getKey());
        criteria.setOrderByClause(" biz_Id desc ");
        criteria.setLimitStart(0);
        criteria.setLimitEnd(15);
        List<Business> businessList = businessMapper.selectByExample(criteria);
        if(CollectionUtils.isNotEmpty(businessList)){
            for(Business b:businessList){
                if(!StringUtils.isBlank(b.getFileName())){
                    b.setFileName(ImageType.BUSINESS.getImagePath()+b.getFileName());
                }
            }
        }

        return businessList;
    }

    @Override
    public Page<Business> queryPageByCondition(SearchCondition condition) {
        Page<Business> page = null;
        if(null != condition){
            page = new Page<>();
            page.setPageSize(condition.getLimit());

            BusinessCriteria criteria = new BusinessCriteria();

            BusinessCriteria.Criteria cri = criteria.createCriteria();
            //id
            if(null != condition.getId()){
                cri.andBizIdEqualTo(condition.getId());
            }
            //状态
            if(null != condition.getCheckStatus()){
                cri.andAudStatusEqualTo(condition.getCheckStatus());
            }
            //排序
            criteria.setOrderByClause(" biz_Id desc ");
            int count = businessMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Business> businessList = businessMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(businessList)){
                    if(CollectionUtils.isNotEmpty(businessList)){
                        for(Business b:businessList){
                            if(!StringUtils.isBlank(b.getFileName())){
                                if(!b.getFileName().contains(ImageType.BUSINESS.getImagePath())){
                                    b.setFileName(ImageType.BUSINESS.getImagePath()+b.getFileName());
                                }
                            }
                            if(!StringUtils.isBlank(b.getFileName2())){
                                if(!b.getFileName2().contains(ImageType.BUSINESS.getImagePath())){
                                    b.setFileName2(ImageType.BUSINESS.getImagePath()+b.getFileName2());
                                }
                            }

                        }
                    }
                    page.setPageData(businessList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public RequestResult addBusiness(Business business) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != business){
            business.setCreateDate(new Date());
            business.setBizStatus(OnlineStatusEnum.WAIT.getKey());
            //默认通过
            business.setAudStatus(CheckStatusEnum.PASS.getKey());
            int i = businessMapper.insertSelective(business);
            if(i>0){
                success = true;
            }
        }else{
            message = "招商项目不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult updateBusiness(Business business) {
        return null;
    }
}
