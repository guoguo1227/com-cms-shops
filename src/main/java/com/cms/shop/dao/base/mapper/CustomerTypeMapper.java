package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.CustomerType;
import com.cms.shop.model.base.CustomerTypeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerTypeMapper extends BaseMapper {
    int countByExample(CustomerTypeCriteria example);

    int deleteByExample(CustomerTypeCriteria example);

    int deleteByPrimaryKey(Integer custTypeId);

    int insert(CustomerType record);

    int insertSelective(CustomerType record);

    List<CustomerType> selectByExample(CustomerTypeCriteria example);

    CustomerType selectByPrimaryKey(Integer custTypeId);

    int updateByExampleSelective(@Param("record") CustomerType record, @Param("example") CustomerTypeCriteria example);

    int updateByExample(@Param("record") CustomerType record, @Param("example") CustomerTypeCriteria example);

    int updateByPrimaryKeySelective(CustomerType record);

    int updateByPrimaryKey(CustomerType record);
}