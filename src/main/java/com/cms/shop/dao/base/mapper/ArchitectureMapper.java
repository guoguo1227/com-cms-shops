package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Architecture;
import com.cms.shop.model.base.ArchitectureCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArchitectureMapper extends BaseMapper {
    int countByExample(ArchitectureCriteria example);

    int deleteByExample(ArchitectureCriteria example);

    int deleteByPrimaryKey(Integer archiId);

    int insert(Architecture record);

    int insertSelective(Architecture record);

    List<Architecture> selectByExample(ArchitectureCriteria example);

    Architecture selectByPrimaryKey(Integer archiId);

    int updateByExampleSelective(@Param("record") Architecture record, @Param("example") ArchitectureCriteria example);

    int updateByExample(@Param("record") Architecture record, @Param("example") ArchitectureCriteria example);

    int updateByPrimaryKeySelective(Architecture record);

    int updateByPrimaryKey(Architecture record);
}