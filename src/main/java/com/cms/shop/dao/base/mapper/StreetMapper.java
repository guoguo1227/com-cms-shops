package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Street;
import com.cms.shop.model.base.StreetCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StreetMapper extends BaseMapper {
    int countByExample(StreetCriteria example);

    int deleteByExample(StreetCriteria example);

    int deleteByPrimaryKey(Integer streetId);

    int insert(Street record);

    int insertSelective(Street record);

    List<Street> selectByExample(StreetCriteria example);

    Street selectByPrimaryKey(Integer streetId);

    int updateByExampleSelective(@Param("record") Street record, @Param("example") StreetCriteria example);

    int updateByExample(@Param("record") Street record, @Param("example") StreetCriteria example);

    int updateByPrimaryKeySelective(Street record);

    int updateByPrimaryKey(Street record);
}