package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.CustAudHist;
import com.cms.shop.model.base.CustAudHistCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustAudHistMapper extends BaseMapper {
    int countByExample(CustAudHistCriteria example);

    int deleteByExample(CustAudHistCriteria example);

    int deleteByPrimaryKey(Integer custAudId);

    int insert(CustAudHist record);

    int insertSelective(CustAudHist record);

    List<CustAudHist> selectByExample(CustAudHistCriteria example);

    CustAudHist selectByPrimaryKey(Integer custAudId);

    int updateByExampleSelective(@Param("record") CustAudHist record, @Param("example") CustAudHistCriteria example);

    int updateByExample(@Param("record") CustAudHist record, @Param("example") CustAudHistCriteria example);

    int updateByPrimaryKeySelective(CustAudHist record);

    int updateByPrimaryKey(CustAudHist record);
}