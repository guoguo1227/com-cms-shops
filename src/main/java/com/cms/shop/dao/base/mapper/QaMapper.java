package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Qa;
import com.cms.shop.model.base.QaCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaMapper extends BaseMapper {
    int countByExample(QaCriteria example);

    int deleteByExample(QaCriteria example);

    int deleteByPrimaryKey(Integer qaId);

    int insert(Qa record);

    int insertSelective(Qa record);

    List<Qa> selectByExample(QaCriteria example);

    Qa selectByPrimaryKey(Integer qaId);

    int updateByExampleSelective(@Param("record") Qa record, @Param("example") QaCriteria example);

    int updateByExample(@Param("record") Qa record, @Param("example") QaCriteria example);

    int updateByPrimaryKeySelective(Qa record);

    int updateByPrimaryKey(Qa record);
}