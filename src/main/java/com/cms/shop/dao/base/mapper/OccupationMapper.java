package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Occupation;
import com.cms.shop.model.base.OccupationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OccupationMapper extends BaseMapper {
    int countByExample(OccupationCriteria example);

    int deleteByExample(OccupationCriteria example);

    int deleteByPrimaryKey(Integer occId);

    int insert(Occupation record);

    int insertSelective(Occupation record);

    List<Occupation> selectByExample(OccupationCriteria example);

    Occupation selectByPrimaryKey(Integer occId);

    int updateByExampleSelective(@Param("record") Occupation record, @Param("example") OccupationCriteria example);

    int updateByExample(@Param("record") Occupation record, @Param("example") OccupationCriteria example);

    int updateByPrimaryKeySelective(Occupation record);

    int updateByPrimaryKey(Occupation record);
}