package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.BizReportData;
import com.cms.shop.model.base.BizReportDataCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizReportDataMapper extends BaseMapper {
    int countByExample(BizReportDataCriteria example);

    int deleteByExample(BizReportDataCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizReportData record);

    int insertSelective(BizReportData record);

    List<BizReportData> selectByExample(BizReportDataCriteria example);

    BizReportData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizReportData record, @Param("example") BizReportDataCriteria example);

    int updateByExample(@Param("record") BizReportData record, @Param("example") BizReportDataCriteria example);

    int updateByPrimaryKeySelective(BizReportData record);

    int updateByPrimaryKey(BizReportData record);
}