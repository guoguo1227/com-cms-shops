package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.SysUserMapper;
import com.cms.shop.model.base.SysUser;
import com.cms.shop.model.base.SysUserCriteria;
import com.cms.shop.service.SysUserService;
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
}
