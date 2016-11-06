package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.BrdAudHist;
import com.cms.shop.model.base.BrdAudHistCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrdAudHistMapper extends BaseMapper {
    int countByExample(BrdAudHistCriteria example);

    int deleteByExample(BrdAudHistCriteria example);

    int deleteByPrimaryKey(Integer brdAudId);

    int insert(BrdAudHist record);

    int insertSelective(BrdAudHist record);

    List<BrdAudHist> selectByExample(BrdAudHistCriteria example);

    BrdAudHist selectByPrimaryKey(Integer brdAudId);

    int updateByExampleSelective(@Param("record") BrdAudHist record, @Param("example") BrdAudHistCriteria example);

    int updateByExample(@Param("record") BrdAudHist record, @Param("example") BrdAudHistCriteria example);

    int updateByPrimaryKeySelective(BrdAudHist record);

    int updateByPrimaryKey(BrdAudHist record);
}