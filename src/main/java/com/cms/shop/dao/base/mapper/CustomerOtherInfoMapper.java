package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.CustomerOtherInfo;
import com.cms.shop.model.base.CustomerOtherInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerOtherInfoMapper extends BaseMapper {
    int countByExample(CustomerOtherInfoCriteria example);

    int deleteByExample(CustomerOtherInfoCriteria example);

    int deleteByPrimaryKey(Integer custInfoId);

    int insert(CustomerOtherInfo record);

    int insertSelective(CustomerOtherInfo record);

    List<CustomerOtherInfo> selectByExample(CustomerOtherInfoCriteria example);

    CustomerOtherInfo selectByPrimaryKey(Integer custInfoId);

    int updateByExampleSelective(@Param("record") CustomerOtherInfo record, @Param("example") CustomerOtherInfoCriteria example);

    int updateByExample(@Param("record") CustomerOtherInfo record, @Param("example") CustomerOtherInfoCriteria example);

    int updateByPrimaryKeySelective(CustomerOtherInfo record);

    int updateByPrimaryKey(CustomerOtherInfo record);
}