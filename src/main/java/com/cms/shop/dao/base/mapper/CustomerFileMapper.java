package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.CustomerFile;
import com.cms.shop.model.base.CustomerFileCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerFileMapper extends BaseMapper {
    int countByExample(CustomerFileCriteria example);

    int deleteByExample(CustomerFileCriteria example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(CustomerFile record);

    int insertSelective(CustomerFile record);

    List<CustomerFile> selectByExample(CustomerFileCriteria example);

    CustomerFile selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") CustomerFile record, @Param("example") CustomerFileCriteria example);

    int updateByExample(@Param("record") CustomerFile record, @Param("example") CustomerFileCriteria example);

    int updateByPrimaryKeySelective(CustomerFile record);

    int updateByPrimaryKey(CustomerFile record);
}