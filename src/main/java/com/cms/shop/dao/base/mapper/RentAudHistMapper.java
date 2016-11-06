package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.RentAudHist;
import com.cms.shop.model.base.RentAudHistCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentAudHistMapper extends BaseMapper {
    int countByExample(RentAudHistCriteria example);

    int deleteByExample(RentAudHistCriteria example);

    int deleteByPrimaryKey(Integer rentAudId);

    int insert(RentAudHist record);

    int insertSelective(RentAudHist record);

    List<RentAudHist> selectByExample(RentAudHistCriteria example);

    RentAudHist selectByPrimaryKey(Integer rentAudId);

    int updateByExampleSelective(@Param("record") RentAudHist record, @Param("example") RentAudHistCriteria example);

    int updateByExample(@Param("record") RentAudHist record, @Param("example") RentAudHistCriteria example);

    int updateByPrimaryKeySelective(RentAudHist record);

    int updateByPrimaryKey(RentAudHist record);
}