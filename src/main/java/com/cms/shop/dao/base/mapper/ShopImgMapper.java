package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.ShopImg;
import com.cms.shop.model.base.ShopImgCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopImgMapper extends BaseMapper {
    int countByExample(ShopImgCriteria example);

    int deleteByExample(ShopImgCriteria example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(ShopImg record);

    int insertSelective(ShopImg record);

    List<ShopImg> selectByExample(ShopImgCriteria example);

    ShopImg selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") ShopImg record, @Param("example") ShopImgCriteria example);

    int updateByExample(@Param("record") ShopImg record, @Param("example") ShopImgCriteria example);

    int updateByPrimaryKeySelective(ShopImg record);

    int updateByPrimaryKey(ShopImg record);
}