package com.cms.shop.service;

import com.cms.shop.model.base.Friend;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.utils.Page;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-8
 */
public interface FriendService {

    Page<Friend> queryListByCondition(SearchCondition condition);

    RequestResult addFriend(Friend friend);

    RequestResult offlineFriend(Friend friend);

}
