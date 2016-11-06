package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Hotcategory;
import com.cms.shop.model.base.HotcategoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotcategoryMapper extends BaseMapper {
    int countByExample(HotcategoryCriteria example);

    int deleteByExample(HotcategoryCriteria example);

    int deleteByPrimaryKey(Integer hotId);

    int insert(Hotcategory record);

    int insertSelective(Hotcategory record);

    List<Hotcategory> selectByExample(HotcategoryCriteria example);

    Hotcategory selectByPrimaryKey(Integer hotId);

    int updateByExampleSelective(@Param("record") Hotcategory record, @Param("example") HotcategoryCriteria example);

    int updateByExample(@Param("record") Hotcategory record, @Param("example") HotcategoryCriteria example);

    int updateByPrimaryKeySelective(Hotcategory record);

    int updateByPrimaryKey(Hotcategory record);
}