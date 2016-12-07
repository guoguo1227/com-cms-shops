package com.cms.shop.service;

import com.cms.shop.model.base.Partner;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.utils.Page;

import java.util.List;

/**
 * @author : samuel
 * @Description :合作伙伴接口
 * @Date : 16-11-8
 */
public interface PartnerService {

    List<Partner> getOnList();

    Page<Partner> queryPageByCondition(SearchCondition condition);

    /**
     * 下架
     * @param id
     * @return
     */
    RequestResult offlinePartner(Integer id);

    /**
     * 上架
     * @param id
     * @return
     */
    RequestResult onlinePartner(Integer id);

    /**
     * 添加
     * @param partner
     * @return
     */
    RequestResult addPartner(Partner partner);

}
