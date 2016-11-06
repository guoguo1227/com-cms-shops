package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.AuditHistory;
import com.cms.shop.model.base.AuditHistoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditHistoryMapper extends BaseMapper {
    int countByExample(AuditHistoryCriteria example);

    int deleteByExample(AuditHistoryCriteria example);

    int deleteByPrimaryKey(Integer auditId);

    int insert(AuditHistory record);

    int insertSelective(AuditHistory record);

    List<AuditHistory> selectByExample(AuditHistoryCriteria example);

    AuditHistory selectByPrimaryKey(Integer auditId);

    int updateByExampleSelective(@Param("record") AuditHistory record, @Param("example") AuditHistoryCriteria example);

    int updateByExample(@Param("record") AuditHistory record, @Param("example") AuditHistoryCriteria example);

    int updateByPrimaryKeySelective(AuditHistory record);

    int updateByPrimaryKey(AuditHistory record);
}