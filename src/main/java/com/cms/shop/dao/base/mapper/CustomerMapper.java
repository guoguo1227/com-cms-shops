package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Customer;
import com.cms.shop.model.base.CustomerCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper extends BaseMapper {
    int countByExample(CustomerCriteria example);

    int deleteByExample(CustomerCriteria example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerCriteria example);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerCriteria example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerCriteria example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}