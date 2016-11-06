package com.cms.shop.dao.base;


import com.cms.shop.model.base.BaseBean;
import com.cms.shop.model.base.BaseCriteria;

import java.util.List;

/**
 * Created by guo on 2015/12/20.
 */
public interface BaseMapper {

   int countByExample(BaseCriteria var1);

   List<BaseBean> selectByExample(BaseCriteria var1);
}
