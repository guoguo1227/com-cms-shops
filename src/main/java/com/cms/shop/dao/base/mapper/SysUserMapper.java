package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.SysUser;
import com.cms.shop.model.base.SysUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper extends BaseMapper {
    int countByExample(SysUserCriteria example);

    int deleteByExample(SysUserCriteria example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserCriteria example);

    SysUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserCriteria example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserCriteria example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}