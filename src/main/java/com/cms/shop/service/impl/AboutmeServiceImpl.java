package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.AboutmeMapper;
import com.cms.shop.dao.base.mapper.ManageMapper;
import com.cms.shop.enums.ImageType;
import com.cms.shop.model.base.Aboutme;
import com.cms.shop.model.base.AboutmeCriteria;
import com.cms.shop.model.base.Manage;
import com.cms.shop.model.base.ManageCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.AboutmeService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by samuel on 17-1-10.
 */
@Service
public class AboutmeServiceImpl implements AboutmeService {

    @Autowired
    private AboutmeMapper aboutmeMapper;

    @Autowired
    private ManageMapper manageMapper;

    @Override
    public List<Aboutme> queryAllList(SearchCondition condition) {

        AboutmeCriteria criteria = new AboutmeCriteria();
        List<Aboutme> list = aboutmeMapper.selectByExample(criteria);
        return list;
    }

    @Override
    public List<Manage> queryManageList(SearchCondition condition) {

        ManageCriteria cri = new ManageCriteria();
        List<Manage> list = manageMapper.selectByExample(cri);
        return list;
    }

    @Override
    public Manage queryManageOnline() {

        Manage manage = null;
        List<Manage> list = queryManageList(null);
        if(CollectionUtils.isNotEmpty(list)){
            manage = list.get(0);
        }
        return manage;
    }

    @Override
    public RequestResult updateManage(Manage manage) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != manage && null != manage.getId()){
            Manage tmp = manageMapper.selectByPrimaryKey(manage.getId());
            if(null != tmp){
                tmp.setDescription(manage.getDescription());
                tmp.setName(manage.getName());
                tmp.setPicture(manage.getPicture());
                tmp.setTitle(manage.getTitle());
                tmp.setCreateTime(new Date());
                int i = manageMapper.updateByPrimaryKeySelective(tmp);
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
    public RequestResult updateAboutme(Aboutme aboutme) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != aboutme && null != aboutme.getId()){
            Aboutme tmp = aboutmeMapper.selectByPrimaryKey(aboutme.getId());
            if(null != tmp){
                tmp.setDescription(aboutme.getDescription());
                tmp.setName(aboutme.getName());
                tmp.setPicture(aboutme.getPicture());
                tmp.setTitle(aboutme.getTitle());
                tmp.setCreateTime(new Date());
                int i = aboutmeMapper.updateByPrimaryKeySelective(tmp);
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
    public Aboutme queryById(Integer id) {
        Aboutme aboutme = null;
        if(null != id){
            aboutme = aboutmeMapper.selectByPrimaryKey(id);
        }
        return aboutme;
    }
}
