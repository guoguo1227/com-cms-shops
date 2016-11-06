package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Flash;
import com.cms.shop.model.base.FlashCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlashMapper extends BaseMapper {
    int countByExample(FlashCriteria example);

    int deleteByExample(FlashCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Flash record);

    int insertSelective(Flash record);

    List<Flash> selectByExample(FlashCriteria example);

    Flash selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Flash record, @Param("example") FlashCriteria example);

    int updateByExample(@Param("record") Flash record, @Param("example") FlashCriteria example);

    int updateByPrimaryKeySelective(Flash record);

    int updateByPrimaryKey(Flash record);
}