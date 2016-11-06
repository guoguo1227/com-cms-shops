package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Partner;
import com.cms.shop.model.base.PartnerCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartnerMapper extends BaseMapper {
    int countByExample(PartnerCriteria example);

    int deleteByExample(PartnerCriteria example);

    int deleteByPrimaryKey(Integer partnerId);

    int insert(Partner record);

    int insertSelective(Partner record);

    List<Partner> selectByExample(PartnerCriteria example);

    Partner selectByPrimaryKey(Integer partnerId);

    int updateByExampleSelective(@Param("record") Partner record, @Param("example") PartnerCriteria example);

    int updateByExample(@Param("record") Partner record, @Param("example") PartnerCriteria example);

    int updateByPrimaryKeySelective(Partner record);

    int updateByPrimaryKey(Partner record);
}