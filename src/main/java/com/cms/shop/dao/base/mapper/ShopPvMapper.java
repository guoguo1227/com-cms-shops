package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.ShopPv;
import com.cms.shop.model.base.ShopPvCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopPvMapper extends BaseMapper {
    int countByExample(ShopPvCriteria example);

    int deleteByExample(ShopPvCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopPv record);

    int insertSelective(ShopPv record);

    List<ShopPv> selectByExample(ShopPvCriteria example);

    ShopPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopPv record, @Param("example") ShopPvCriteria example);

    int updateByExample(@Param("record") ShopPv record, @Param("example") ShopPvCriteria example);

    int updateByPrimaryKeySelective(ShopPv record);

    int updateByPrimaryKey(ShopPv record);
}