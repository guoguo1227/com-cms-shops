package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.AdAudHist;
import com.cms.shop.model.base.AdAudHistCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdAudHistMapper extends BaseMapper {
    int countByExample(AdAudHistCriteria example);

    int deleteByExample(AdAudHistCriteria example);

    int deleteByPrimaryKey(Integer adAudId);

    int insert(AdAudHist record);

    int insertSelective(AdAudHist record);

    List<AdAudHist> selectByExample(AdAudHistCriteria example);

    AdAudHist selectByPrimaryKey(Integer adAudId);

    int updateByExampleSelective(@Param("record") AdAudHist record, @Param("example") AdAudHistCriteria example);

    int updateByExample(@Param("record") AdAudHist record, @Param("example") AdAudHistCriteria example);

    int updateByPrimaryKeySelective(AdAudHist record);

    int updateByPrimaryKey(AdAudHist record);
}