package com.cms.shop.service;

import com.cms.shop.model.base.Qa;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.QaVo;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.utils.Page;

/**
 * @author : samuel
 * @Description :留言服务
 * @Date : 16-12-3
 */
public interface QAService {

    Page<QaVo> queryQAPageByCondition(SearchCondition condition);

    RequestResult check(Integer id,boolean ifPass);

    RequestResult add(Qa qa);

}
