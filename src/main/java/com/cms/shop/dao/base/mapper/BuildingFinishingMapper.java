package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.BuildingFinishing;
import com.cms.shop.model.base.BuildingFinishingCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuildingFinishingMapper extends BaseMapper {
    int countByExample(BuildingFinishingCriteria example);

    int deleteByExample(BuildingFinishingCriteria example);

    int deleteByPrimaryKey(Integer finishingId);

    int insert(BuildingFinishing record);

    int insertSelective(BuildingFinishing record);

    List<BuildingFinishing> selectByExample(BuildingFinishingCriteria example);

    BuildingFinishing selectByPrimaryKey(Integer finishingId);

    int updateByExampleSelective(@Param("record") BuildingFinishing record, @Param("example") BuildingFinishingCriteria example);

    int updateByExample(@Param("record") BuildingFinishing record, @Param("example") BuildingFinishingCriteria example);

    int updateByPrimaryKeySelective(BuildingFinishing record);

    int updateByPrimaryKey(BuildingFinishing record);
}