package com.cms.shop.service.impl;

import com.cms.shop.constants.ShopConstant;
import com.cms.shop.dao.base.mapper.FriendMapper;
import com.cms.shop.enums.CheckStatusEnum;
import com.cms.shop.enums.OnlineStatusEnum;
import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.FriendService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-8
 */
@Service
public class FriendServiceImpl implements FriendService{

    @Autowired
    private FriendMapper friendMapper;

    @Override
    public Page<Friend> queryListByCondition(SearchCondition condition) {
        Page<Friend> page = null;
        if(null != condition){
            page = new Page<>();
            page.setPageSize(condition.getLimit());

            FriendCriteria criteria = new FriendCriteria();
            //排序
            criteria.setOrderByClause(" FRIEND_ID desc ");
            int count = friendMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Friend> friendList = friendMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(friendList)){
                    page.setPageData(friendList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public RequestResult addFriend(Friend friend) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != friend){
            //todo
            friend.setStatus(OnlineStatusEnum.ONLINE.getKey());
            friend.setEditTag(ShopConstant.EDIT_TAG_LOCK);
            int i = friendMapper.insertSelective(friend);
            if(i>0){
                success = true;
            }
        }else{
            message = "友情链接不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult updateFriendStatus(Integer id,Integer status) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            Friend friend = friendMapper.selectByPrimaryKey(id);
            if(null != friend){
                friend.setStatus(status);
                int i = friendMapper.updateByPrimaryKeySelective(friend);
                if(i>0){
                    success = true;
                }

            }else{
                message = "该友情链接不存在!";
            }
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }
}
