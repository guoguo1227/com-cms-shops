package com.cms.shop.service;

import com.cms.shop.model.base.Street;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.StreetVo;
import com.cms.shop.utils.Page;

import java.util.List;

/**
 * @author : samuel
 * @Description :街道服务
 * @Date : 16-11-6
 */
public interface StreetService {

    Page<Street> queryPageByCondition(SearchCondition condition);

    Page<StreetVo> queryVoByCondtion(SearchCondition condition);

    List<Street> queryAll();

    boolean deleteById(Integer id);
}
