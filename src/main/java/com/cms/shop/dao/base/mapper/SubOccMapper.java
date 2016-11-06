package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.SubOcc;
import com.cms.shop.model.base.SubOccCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubOccMapper extends BaseMapper {
    int countByExample(SubOccCriteria example);

    int deleteByExample(SubOccCriteria example);

    int deleteByPrimaryKey(Integer subOccId);

    int insert(SubOcc record);

    int insertSelective(SubOcc record);

    List<SubOcc> selectByExample(SubOccCriteria example);

    SubOcc selectByPrimaryKey(Integer subOccId);

    int updateByExampleSelective(@Param("record") SubOcc record, @Param("example") SubOccCriteria example);

    int updateByExample(@Param("record") SubOcc record, @Param("example") SubOccCriteria example);

    int updateByPrimaryKeySelective(SubOcc record);

    int updateByPrimaryKey(SubOcc record);
}