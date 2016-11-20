package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Keyword;
import com.cms.shop.model.base.KeywordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordMapper extends BaseMapper {
    int countByExample(KeywordCriteria example);

    int deleteByExample(KeywordCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Keyword record);

    int insertSelective(Keyword record);

    List<Keyword> selectByExample(KeywordCriteria example);

    Keyword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Keyword record, @Param("example") KeywordCriteria example);

    int updateByExample(@Param("record") Keyword record, @Param("example") KeywordCriteria example);

    int updateByPrimaryKeySelective(Keyword record);

    int updateByPrimaryKey(Keyword record);
}