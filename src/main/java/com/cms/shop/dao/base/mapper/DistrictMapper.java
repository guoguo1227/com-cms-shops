package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.District;
import com.cms.shop.model.base.DistrictCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistrictMapper extends BaseMapper {
    int countByExample(DistrictCriteria example);

    int deleteByExample(DistrictCriteria example);

    int deleteByPrimaryKey(Integer districtId);

    int insert(District record);

    int insertSelective(District record);

    List<District> selectByExample(DistrictCriteria example);

    District selectByPrimaryKey(Integer districtId);

    int updateByExampleSelective(@Param("record") District record, @Param("example") DistrictCriteria example);

    int updateByExample(@Param("record") District record, @Param("example") DistrictCriteria example);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}