package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.ThrdOcc;
import com.cms.shop.model.base.ThrdOccCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThrdOccMapper extends BaseMapper {
    int countByExample(ThrdOccCriteria example);

    int deleteByExample(ThrdOccCriteria example);

    int deleteByPrimaryKey(Integer thrdOccId);

    int insert(ThrdOcc record);

    int insertSelective(ThrdOcc record);

    List<ThrdOcc> selectByExample(ThrdOccCriteria example);

    ThrdOcc selectByPrimaryKey(Integer thrdOccId);

    int updateByExampleSelective(@Param("record") ThrdOcc record, @Param("example") ThrdOccCriteria example);

    int updateByExample(@Param("record") ThrdOcc record, @Param("example") ThrdOccCriteria example);

    int updateByPrimaryKeySelective(ThrdOcc record);

    int updateByPrimaryKey(ThrdOcc record);
}