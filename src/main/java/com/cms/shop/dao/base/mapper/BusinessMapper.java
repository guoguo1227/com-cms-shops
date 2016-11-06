package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Business;
import com.cms.shop.model.base.BusinessCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessMapper extends BaseMapper {
    int countByExample(BusinessCriteria example);

    int deleteByExample(BusinessCriteria example);

    int deleteByPrimaryKey(Integer bizId);

    int insert(Business record);

    int insertSelective(Business record);

    List<Business> selectByExample(BusinessCriteria example);

    Business selectByPrimaryKey(Integer bizId);

    int updateByExampleSelective(@Param("record") Business record, @Param("example") BusinessCriteria example);

    int updateByExample(@Param("record") Business record, @Param("example") BusinessCriteria example);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}