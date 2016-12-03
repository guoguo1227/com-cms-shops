package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.QaMapper;
import com.cms.shop.enums.CheckStatusEnum;
import com.cms.shop.model.base.District;
import com.cms.shop.model.base.Qa;
import com.cms.shop.model.base.QaCriteria;
import com.cms.shop.model.base.Shop;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.QaVo;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.DistrictService;
import com.cms.shop.service.QAService;
import com.cms.shop.service.ShopService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-12-3
 */

@Service
public class QAServiceImpl implements QAService{

    @Autowired
    private QaMapper qaMapper;

    @Autowired
    private ShopService shopService;

    @Autowired
    private DistrictService districtService;

    @Override
    public Page<QaVo> queryQAPageByCondition(SearchCondition condition) {
        Page<QaVo> page = null;
        List<QaVo> list = new ArrayList<>();
        if(null != condition){
            page = new Page<>();
            page.setPageSize(condition.getLimit());

            QaCriteria criteria = new QaCriteria();
            QaCriteria.Criteria cri = criteria.createCriteria();

            if(null != condition.getCheckStatus()){
                cri.andAuditStatusEqualTo(condition.getCheckStatus());
            }
            int count = qaMapper.countByExample(criteria);
            criteria.setOrderByClause(" CREATE_DATE desc ");
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Qa> qaList = qaMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(qaList)){
                    for(Qa a : qaList){
                        QaVo vo = new QaVo();
                        vo.setQa(a);
                        if(null != a.getShopId()){
                            Shop shop = shopService.queryShopById(a.getShopId());
                            if(null != shop){
                                vo.setShopName(shop.getShopName());
                                if(null != shop.getDistrictId()){
                                    District district = districtService.queryDistrictById(shop.getDistrictId());
                                    if(null != district){
                                        vo.setDistruct(district.getDistrictName());
                                    }
                                }
                            }
                        }
                        list.add(vo);
                    }
                    page.setPageData(list);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public RequestResult pass(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            Qa qa = qaMapper.selectByPrimaryKey(id);
            if(null != qa){
                qa.setAuditStatus(CheckStatusEnum.PASS.getKey());
                qa.setAuditDate(new Date());
                int i = qaMapper.updateByPrimaryKeySelective(qa);
                if(i>0){
                    success = true;
                }
            }else{
                message = "该留言不存在";
            }

        }else{
            message = "id不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult add(Qa qa) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != qa && !StringUtils.isBlank(qa.getAskerName())){
            int i = qaMapper.insertSelective(qa);
            if(i>0){
                success = true;
            }
        }else{
            message = "留言内容和企业名称不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }
}
