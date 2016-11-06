package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Friend;
import com.cms.shop.model.base.FriendCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendMapper extends BaseMapper {
    int countByExample(FriendCriteria example);

    int deleteByExample(FriendCriteria example);

    int deleteByPrimaryKey(Integer friendId);

    int insert(Friend record);

    int insertSelective(Friend record);

    List<Friend> selectByExample(FriendCriteria example);

    Friend selectByPrimaryKey(Integer friendId);

    int updateByExampleSelective(@Param("record") Friend record, @Param("example") FriendCriteria example);

    int updateByExample(@Param("record") Friend record, @Param("example") FriendCriteria example);

    int updateByPrimaryKeySelective(Friend record);

    int updateByPrimaryKey(Friend record);
}