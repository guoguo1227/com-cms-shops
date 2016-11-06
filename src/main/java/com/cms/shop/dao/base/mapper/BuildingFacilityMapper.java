package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.BuildingFacility;
import com.cms.shop.model.base.BuildingFacilityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuildingFacilityMapper extends BaseMapper {
    int countByExample(BuildingFacilityCriteria example);

    int deleteByExample(BuildingFacilityCriteria example);

    int deleteByPrimaryKey(Integer facilId);

    int insert(BuildingFacility record);

    int insertSelective(BuildingFacility record);

    List<BuildingFacility> selectByExample(BuildingFacilityCriteria example);

    BuildingFacility selectByPrimaryKey(Integer facilId);

    int updateByExampleSelective(@Param("record") BuildingFacility record, @Param("example") BuildingFacilityCriteria example);

    int updateByExample(@Param("record") BuildingFacility record, @Param("example") BuildingFacilityCriteria example);

    int updateByPrimaryKeySelective(BuildingFacility record);

    int updateByPrimaryKey(BuildingFacility record);
}