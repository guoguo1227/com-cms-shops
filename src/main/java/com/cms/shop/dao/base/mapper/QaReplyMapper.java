package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.QaReply;
import com.cms.shop.model.base.QaReplyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaReplyMapper extends BaseMapper {
    int countByExample(QaReplyCriteria example);

    int deleteByExample(QaReplyCriteria example);

    int deleteByPrimaryKey(Integer replyId);

    int insert(QaReply record);

    int insertSelective(QaReply record);

    List<QaReply> selectByExample(QaReplyCriteria example);

    QaReply selectByPrimaryKey(Integer replyId);

    int updateByExampleSelective(@Param("record") QaReply record, @Param("example") QaReplyCriteria example);

    int updateByExample(@Param("record") QaReply record, @Param("example") QaReplyCriteria example);

    int updateByPrimaryKeySelective(QaReply record);

    int updateByPrimaryKey(QaReply record);
}