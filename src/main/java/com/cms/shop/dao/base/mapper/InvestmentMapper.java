package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Investment;
import com.cms.shop.model.base.InvestmentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvestmentMapper extends BaseMapper {
    int countByExample(InvestmentCriteria example);

    int deleteByExample(InvestmentCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Investment record);

    int insertSelective(Investment record);

    List<Investment> selectByExample(InvestmentCriteria example);

    Investment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Investment record, @Param("example") InvestmentCriteria example);

    int updateByExample(@Param("record") Investment record, @Param("example") InvestmentCriteria example);

    int updateByPrimaryKeySelective(Investment record);

    int updateByPrimaryKey(Investment record);
}