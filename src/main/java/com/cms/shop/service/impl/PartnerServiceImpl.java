package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.PartnerMapper;
import com.cms.shop.enums.ImageType;
import com.cms.shop.enums.OnlineStatusEnum;
import com.cms.shop.model.base.Partner;
import com.cms.shop.model.base.PartnerCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.PartnerService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-8
 */
@Service
public class PartnerServiceImpl implements PartnerService{

    @Autowired
    private PartnerMapper partnerMapper;

    private final Integer EDIT_TAG  = 0; //未锁定

    @Override
    public List<Partner> getOnList() {

        PartnerCriteria criteria = new PartnerCriteria();
        criteria.createCriteria().andStatusEqualTo(OnlineStatusEnum.ONLINE.getKey()).andEditTagEqualTo(EDIT_TAG);

        criteria.setLimitStart(0);
        criteria.setLimitEnd(4);
        List<Partner> partnerList = partnerMapper.selectByExample(criteria);
        if(CollectionUtils.isNotEmpty(partnerList)){
            for(Partner partner : partnerList){
                if(!StringUtils.isBlank(partner.getFileName())){
                    partner.setFileName(ImageType.PARTNER.getImagePath()+partner.getFileName());
                }
            }
        }
        return partnerList;
    }

    @Override
    public Page<Partner> queryPageByCondition(SearchCondition condition) {
        Page<Partner> page = null;
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            PartnerCriteria criteria = new PartnerCriteria();
            int count = partnerMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Partner> partnerList = partnerMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(partnerList)){
                    for(Partner partner : partnerList){
                        if(!StringUtils.isBlank(partner.getFileName())){
                            partner.setFileName(ImageType.PARTNER.getImagePath()+partner.getFileName());
                        }
                    }
                    page.setPageData(partnerList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public RequestResult offlinePartner(Integer id) {
        return null;
    }

    @Override
    public RequestResult onlinePartner(Integer id) {
        return null;
    }
}
