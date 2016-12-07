package com.cms.shop.service;

import com.cms.shop.model.base.SysUser;
import com.cms.shop.model.base.SysUserCriteria;
import com.cms.shop.model.ext.RequestResult;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-7
 */
public interface SysUserService {

    List<SysUser> queryListByExample(SysUserCriteria criteria);

    SysUser queryUserById(Integer id);

    SysUser queryUserByName(String username);

    RequestResult login(String username,String password);
}
