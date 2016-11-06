package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.RentHistory;
import com.cms.shop.model.base.RentHistoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentHistoryMapper extends BaseMapper {
    int countByExample(RentHistoryCriteria example);

    int deleteByExample(RentHistoryCriteria example);

    int deleteByPrimaryKey(Integer rentId);

    int insert(RentHistory record);

    int insertSelective(RentHistory record);

    List<RentHistory> selectByExample(RentHistoryCriteria example);

    RentHistory selectByPrimaryKey(Integer rentId);

    int updateByExampleSelective(@Param("record") RentHistory record, @Param("example") RentHistoryCriteria example);

    int updateByExample(@Param("record") RentHistory record, @Param("example") RentHistoryCriteria example);

    int updateByPrimaryKeySelective(RentHistory record);

    int updateByPrimaryKey(RentHistory record);
}