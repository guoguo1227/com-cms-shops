package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.BizImg;
import com.cms.shop.model.base.BizImgCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizImgMapper extends BaseMapper {
    int countByExample(BizImgCriteria example);

    int deleteByExample(BizImgCriteria example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(BizImg record);

    int insertSelective(BizImg record);

    List<BizImg> selectByExample(BizImgCriteria example);

    BizImg selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") BizImg record, @Param("example") BizImgCriteria example);

    int updateByExample(@Param("record") BizImg record, @Param("example") BizImgCriteria example);

    int updateByPrimaryKeySelective(BizImg record);

    int updateByPrimaryKey(BizImg record);
}