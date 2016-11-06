package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Message;
import com.cms.shop.model.base.MessageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper extends BaseMapper {
    int countByExample(MessageCriteria example);

    int deleteByExample(MessageCriteria example);

    int deleteByPrimaryKey(Integer msgId);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageCriteria example);

    Message selectByPrimaryKey(Integer msgId);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageCriteria example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageCriteria example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}