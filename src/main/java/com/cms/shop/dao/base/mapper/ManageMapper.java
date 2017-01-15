package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Manage;
import com.cms.shop.model.base.ManageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageMapper extends BaseMapper {
    int countByExample(ManageCriteria example);

    int deleteByExample(ManageCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Manage record);

    int insertSelective(Manage record);

    List<Manage> selectByExample(ManageCriteria example);

    Manage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Manage record, @Param("example") ManageCriteria example);

    int updateByExample(@Param("record") Manage record, @Param("example") ManageCriteria example);

    int updateByPrimaryKeySelective(Manage record);

    int updateByPrimaryKey(Manage record);
}