package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Contract;
import com.cms.shop.model.base.ContractCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractMapper extends BaseMapper {
    int countByExample(ContractCriteria example);

    int deleteByExample(ContractCriteria example);

    int deleteByPrimaryKey(Integer contractId);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExample(ContractCriteria example);

    Contract selectByPrimaryKey(Integer contractId);

    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractCriteria example);

    int updateByExample(@Param("record") Contract record, @Param("example") ContractCriteria example);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}