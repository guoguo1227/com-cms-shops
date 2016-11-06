package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.BizAudHist;
import com.cms.shop.model.base.BizAudHistCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizAudHistMapper extends BaseMapper {
    int countByExample(BizAudHistCriteria example);

    int deleteByExample(BizAudHistCriteria example);

    int deleteByPrimaryKey(Integer bizAudId);

    int insert(BizAudHist record);

    int insertSelective(BizAudHist record);

    List<BizAudHist> selectByExample(BizAudHistCriteria example);

    BizAudHist selectByPrimaryKey(Integer bizAudId);

    int updateByExampleSelective(@Param("record") BizAudHist record, @Param("example") BizAudHistCriteria example);

    int updateByExample(@Param("record") BizAudHist record, @Param("example") BizAudHistCriteria example);

    int updateByPrimaryKeySelective(BizAudHist record);

    int updateByPrimaryKey(BizAudHist record);
}