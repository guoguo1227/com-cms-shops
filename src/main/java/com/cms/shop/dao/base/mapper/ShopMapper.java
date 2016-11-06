package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Shop;
import com.cms.shop.model.base.ShopCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper extends BaseMapper {
    int countByExample(ShopCriteria example);

    int deleteByExample(ShopCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopCriteria example);

    Shop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopCriteria example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopCriteria example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}