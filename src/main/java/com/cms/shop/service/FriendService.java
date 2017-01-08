package com.cms.shop.service;

import com.cms.shop.enums.BoardTypeEnum;
import com.cms.shop.model.base.Friend;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.utils.Page;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-8
 */
public interface FriendService {

    Page<Friend> queryListByCondition(SearchCondition condition);

    RequestResult addFriend(Friend friend);

    RequestResult updateFriend(Friend friend);

    RequestResult updateFriendStatus(Integer id,Integer status);

    List<Friend> queryOnList(SearchCondition condition);

}
