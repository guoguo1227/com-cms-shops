package com.cms.shop.service.impl;

import com.cms.shop.constants.ShopConstant;
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
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            Partner partner = partnerMapper.selectByPrimaryKey(id);
            if(null != partner){
                partner.setStatus(OnlineStatusEnum.OFFLINE.getKey());
                int i = partnerMapper.updateByPrimaryKeySelective(partner);
                if(i>0){
                    success = true;
                }
            }else{
                message = "合作伙伴已删除";
            }
        }else{
            message = "合作伙伴不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult onlinePartner(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            Partner partner = partnerMapper.selectByPrimaryKey(id);
            if(null != partner){
                partner.setStatus(OnlineStatusEnum.ONLINE.getKey());
                int i = partnerMapper.updateByPrimaryKeySelective(partner);
                if(i>0){
                    success = true;
                }
            }else{
                message = "合作伙伴已删除";
            }
        }else{
            message = "合作伙伴不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult addPartner(Partner partner) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != partner){
            //默认未上架
            partner.setStatus(OnlineStatusEnum.OFFLINE.getKey());
            partner.setEditTag(ShopConstant.EDIT_TAG_LOCK);
            int i  = partnerMapper.insertSelective(partner);
            if(i>0){
                success = true;
            }

        }else{
            message = "合作伙伴不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }
}
