package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.BizqaReply;
import com.cms.shop.model.base.BizqaReplyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizqaReplyMapper extends BaseMapper {
    int countByExample(BizqaReplyCriteria example);

    int deleteByExample(BizqaReplyCriteria example);

    int deleteByPrimaryKey(Integer replyId);

    int insert(BizqaReply record);

    int insertSelective(BizqaReply record);

    List<BizqaReply> selectByExample(BizqaReplyCriteria example);

    BizqaReply selectByPrimaryKey(Integer replyId);

    int updateByExampleSelective(@Param("record") BizqaReply record, @Param("example") BizqaReplyCriteria example);

    int updateByExample(@Param("record") BizqaReply record, @Param("example") BizqaReplyCriteria example);

    int updateByPrimaryKeySelective(BizqaReply record);

    int updateByPrimaryKey(BizqaReply record);
}