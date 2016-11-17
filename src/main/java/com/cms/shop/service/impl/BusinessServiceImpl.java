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
            page = new Page();
            page.setPageSize(condition.getLimit());

            BusinessCriteria criteria = new BusinessCriteria();

            BusinessCriteria.Criteria cri = criteria.createCriteria();
            //id
            if(null != condition.getId()){
                cri.andBizIdEqualTo(condition.getId());
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
                                b.setFileName(ImageType.BUSINESS.getImagePath()+b.getFileName());
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
        return null;
    }

    @Override
    public RequestResult updateBusiness(Business business) {
        return null;
    }
}
