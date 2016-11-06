package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.BuildingOccupancy;
import com.cms.shop.model.base.BuildingOccupancyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuildingOccupancyMapper extends BaseMapper {
    int countByExample(BuildingOccupancyCriteria example);

    int deleteByExample(BuildingOccupancyCriteria example);

    int deleteByPrimaryKey(Integer ocpyId);

    int insert(BuildingOccupancy record);

    int insertSelective(BuildingOccupancy record);

    List<BuildingOccupancy> selectByExample(BuildingOccupancyCriteria example);

    BuildingOccupancy selectByPrimaryKey(Integer ocpyId);

    int updateByExampleSelective(@Param("record") BuildingOccupancy record, @Param("example") BuildingOccupancyCriteria example);

    int updateByExample(@Param("record") BuildingOccupancy record, @Param("example") BuildingOccupancyCriteria example);

    int updateByPrimaryKeySelective(BuildingOccupancy record);

    int updateByPrimaryKey(BuildingOccupancy record);
}