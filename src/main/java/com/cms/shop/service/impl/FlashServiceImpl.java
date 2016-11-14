package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.FlashMapper;
import com.cms.shop.enums.ImageType;
import com.cms.shop.model.base.Flash;
import com.cms.shop.model.base.FlashCriteria;
import com.cms.shop.model.base.Street;
import com.cms.shop.model.base.StreetCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.FlashService;
import com.cms.shop.utils.Page;
import freemarker.template.utility.StringUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-11
 */
@Service
public class FlashServiceImpl implements FlashService{

    @Autowired
    private FlashMapper flashMapper;

    @Override
    public Page<Flash> queryListByCondition(SearchCondition condition) {
        Page<Flash> page = null;
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            FlashCriteria criteria = new FlashCriteria();
            int count = flashMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Flash> flashList = flashMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(flashList)){
                    for(Flash flash : flashList){
                        if(!StringUtils.isBlank(flash.getFlashName())){
                            flash.setFlashName(ImageType.FLASH.getImagePath()+flash.getFlashName());
                        }
                    }
                    page.setPageData(flashList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public RequestResult offlineFlash(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            Flash flash = flashMapper.selectByPrimaryKey(id);
            if(null != flash){
                flash.setStatus(0); //下架
                int i = flashMapper.updateByPrimaryKeySelective(flash);
                if(i>0){
                    success = true;
                }
            }

        }else{
            message = "id不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult onlineFlash(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            Flash flash = flashMapper.selectByPrimaryKey(id);
            if(null != flash){
                flash.setStatus(1); //上架
                int i = flashMapper.updateByPrimaryKeySelective(flash);
                if(i>0){
                    success = true;
                }
            }

        }else{
            message = "id不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }


}
