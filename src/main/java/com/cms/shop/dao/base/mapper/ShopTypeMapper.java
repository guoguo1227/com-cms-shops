package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.ShopType;
import com.cms.shop.model.base.ShopTypeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopTypeMapper extends BaseMapper {
    int countByExample(ShopTypeCriteria example);

    int deleteByExample(ShopTypeCriteria example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(ShopType record);

    int insertSelective(ShopType record);

    List<ShopType> selectByExample(ShopTypeCriteria example);

    ShopType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") ShopType record, @Param("example") ShopTypeCriteria example);

    int updateByExample(@Param("record") ShopType record, @Param("example") ShopTypeCriteria example);

    int updateByPrimaryKeySelective(ShopType record);

    int updateByPrimaryKey(ShopType record);
}