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
import com.cms.shop.utils.BeanUtilExt;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
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
            //上架状态
            if(null != condition.getStatus()){
                cri.andBizStatusEqualTo(condition.getStatus());
            }
            //审核状态
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
        Date now = new Date();
        String message = "";
        if(null != business){
            if(null != business.getBizId()){
                //编辑
                Business tmp = businessMapper.selectByPrimaryKey(business.getBizId());
                if(null != tmp){
                    try {
                        BeanUtilExt.copyProperties(tmp,business);
                        if(null != tmp.getOnsellDate()){
                            //开始时间<now
                            if(tmp.getOnsellDate().before(now)){
                                tmp.setBizStatus(OnlineStatusEnum.ONLINE.getKey()); //上架
                                if(null != tmp.getOffsellDate() && tmp.getOffsellDate().before(now)){
                                    tmp.setBizStatus(OnlineStatusEnum.OFFLINE.getKey()); //下架
                                }
                            }else{
                                //开始时间>now 结束时间为空
                                tmp.setBizStatus(OnlineStatusEnum.WAIT.getKey()); //待上架
                            }
                        }
                        int i = businessMapper.updateByPrimaryKeySelective(tmp);
                        if(i>0){
                            success = true;
                        }
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }else{
                //添加
                business.setCreateDate(new Date());
                business.setBizStatus(OnlineStatusEnum.WAIT.getKey());
                //默认待审核
                business.setAudStatus(CheckStatusEnum.AUDIT.getKey());
                int i = businessMapper.insertSelective(business);
                if(i>0){
                    success = true;
                }
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

    @Override
    public RequestResult checkBusiness(Integer id, boolean ifPass) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id ){
            Business business = businessMapper.selectByPrimaryKey(id);
            if(null != business){
                if(ifPass){
                    business.setAudStatus(CheckStatusEnum.PASS.getKey());
                }else{
                    business.setAudStatus(CheckStatusEnum.NOPASS.getKey());
                }
                int i = businessMapper.updateByPrimaryKey(business);
                if(i>0){
                    success = true;
                }
            }

        }else{
            message = "id不可为空";
        }
        result.setMessage(message);
        result.setSuccess(success);
        return result;
    }
}
