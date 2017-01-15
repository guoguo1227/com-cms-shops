package com.cms.shop.service;

import com.cms.shop.model.base.Aboutme;
import com.cms.shop.model.base.Manage;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;

import java.util.List;

/**
 * Created by samuel on 17-1-10.
 */
public interface AboutmeService {

    List<Aboutme> queryAllList(SearchCondition condition);

    List<Manage> queryManageList(SearchCondition condition);

    Manage queryManageOnline();

    RequestResult updateManage(Manage manage);

    RequestResult updateAboutme(Aboutme aboutme);

    Aboutme queryById(Integer id);
}
