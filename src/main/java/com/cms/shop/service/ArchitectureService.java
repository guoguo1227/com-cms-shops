package com.cms.shop.service;

import com.cms.shop.model.base.Architecture;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.utils.Page;

/**
 * @author : samuel
 * @Description :建筑结构服务
 * @Date : 16-11-6
 */
public interface ArchitectureService {

    Page<Architecture> queryPageByCondition(SearchCondition condition);

    boolean deleteById(Integer id);
}
