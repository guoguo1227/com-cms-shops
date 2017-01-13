package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Aboutme;
import com.cms.shop.model.base.AboutmeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AboutmeMapper extends BaseMapper {
    int countByExample(AboutmeCriteria example);

    int deleteByExample(AboutmeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Aboutme record);

    int insertSelective(Aboutme record);

    List<Aboutme> selectByExample(AboutmeCriteria example);

    Aboutme selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Aboutme record, @Param("example") AboutmeCriteria example);

    int updateByExample(@Param("record") Aboutme record, @Param("example") AboutmeCriteria example);

    int updateByPrimaryKeySelective(Aboutme record);

    int updateByPrimaryKey(Aboutme record);
}