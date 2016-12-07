package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.SysUserMapper;
import com.cms.shop.model.base.Flash;
import com.cms.shop.model.base.SysUser;
import com.cms.shop.model.base.SysUserCriteria;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.SysUserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-7
 */
@Service
public class SysUserServiceImpl implements SysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> queryListByExample(SysUserCriteria criteria) {
        if(null == criteria){
            criteria = new SysUserCriteria();
        }
        List<SysUser> sysUserList = sysUserMapper.selectByExample(criteria);
        return sysUserList;
    }

    @Override
    public SysUser queryUserById(Integer id) {
        SysUser sysUser = null;
        if(null != id){
            sysUser = sysUserMapper.selectByPrimaryKey(id);
        }
        return sysUser;
    }

    @Override
    public SysUser queryUserByName(String username) {
        SysUser sysUser = null;
        if(!StringUtils.isBlank(username)){
            SysUserCriteria criteria = new SysUserCriteria();
            criteria.createCriteria().andUserNameEqualTo(username);
            List<SysUser> sysUserList = sysUserMapper.selectByExample(criteria);
            if(CollectionUtils.isNotEmpty(sysUserList)){
                sysUser = sysUserList.get(0);
            }
        }
        return sysUser;
    }

    @Override
    public RequestResult login(String username, String password) {
        String message = "";
        boolean success = false;
        RequestResult result = new RequestResult();
        if(!StringUtils.isBlank(username)){
            SysUserCriteria cri = new SysUserCriteria();
            cri.createCriteria().andUserNameEqualTo(username);
            List<SysUser> userList = sysUserMapper.selectByExample(cri);
            if(CollectionUtils.isNotEmpty(userList)){
                SysUser sysUser = userList.get(0);
                if(!StringUtils.isBlank(password)){
                    if(password.equals(sysUser.getUserPwd())){
                        success = true;
                    }else{
                        message = "密码错误";
                    }
                }
            }else{
                message = "用户名不存在";
            }
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

}
