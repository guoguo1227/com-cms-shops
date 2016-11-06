package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.MessageType;
import com.cms.shop.model.base.MessageTypeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageTypeMapper extends BaseMapper {
    int countByExample(MessageTypeCriteria example);

    int deleteByExample(MessageTypeCriteria example);

    int deleteByPrimaryKey(Integer msgTypeId);

    int insert(MessageType record);

    int insertSelective(MessageType record);

    List<MessageType> selectByExample(MessageTypeCriteria example);

    MessageType selectByPrimaryKey(Integer msgTypeId);

    int updateByExampleSelective(@Param("record") MessageType record, @Param("example") MessageTypeCriteria example);

    int updateByExample(@Param("record") MessageType record, @Param("example") MessageTypeCriteria example);

    int updateByPrimaryKeySelective(MessageType record);

    int updateByPrimaryKey(MessageType record);
}