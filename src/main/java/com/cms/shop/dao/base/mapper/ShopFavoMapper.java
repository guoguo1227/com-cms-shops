package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.ShopFavo;
import com.cms.shop.model.base.ShopFavoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopFavoMapper extends BaseMapper {
    int countByExample(ShopFavoCriteria example);

    int deleteByExample(ShopFavoCriteria example);

    int deleteByPrimaryKey(Integer favoId);

    int insert(ShopFavo record);

    int insertSelective(ShopFavo record);

    List<ShopFavo> selectByExample(ShopFavoCriteria example);

    ShopFavo selectByPrimaryKey(Integer favoId);

    int updateByExampleSelective(@Param("record") ShopFavo record, @Param("example") ShopFavoCriteria example);

    int updateByExample(@Param("record") ShopFavo record, @Param("example") ShopFavoCriteria example);

    int updateByPrimaryKeySelective(ShopFavo record);

    int updateByPrimaryKey(ShopFavo record);
}