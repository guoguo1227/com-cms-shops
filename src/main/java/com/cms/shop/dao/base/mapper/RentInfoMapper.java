package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.RentInfo;
import com.cms.shop.model.base.RentInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentInfoMapper extends BaseMapper {
    int countByExample(RentInfoCriteria example);

    int deleteByExample(RentInfoCriteria example);

    int deleteByPrimaryKey(Integer rentInfoId);

    int insert(RentInfo record);

    int insertSelective(RentInfo record);

    List<RentInfo> selectByExample(RentInfoCriteria example);

    RentInfo selectByPrimaryKey(Integer rentInfoId);

    int updateByExampleSelective(@Param("record") RentInfo record, @Param("example") RentInfoCriteria example);

    int updateByExample(@Param("record") RentInfo record, @Param("example") RentInfoCriteria example);

    int updateByPrimaryKeySelective(RentInfo record);

    int updateByPrimaryKey(RentInfo record);
}