package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Advert;
import com.cms.shop.model.base.AdvertCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvertMapper extends BaseMapper {
    int countByExample(AdvertCriteria example);

    int deleteByExample(AdvertCriteria example);

    int deleteByPrimaryKey(Integer adId);

    int insert(Advert record);

    int insertSelective(Advert record);

    List<Advert> selectByExample(AdvertCriteria example);

    Advert selectByPrimaryKey(Integer adId);

    int updateByExampleSelective(@Param("record") Advert record, @Param("example") AdvertCriteria example);

    int updateByExample(@Param("record") Advert record, @Param("example") AdvertCriteria example);

    int updateByPrimaryKeySelective(Advert record);

    int updateByPrimaryKey(Advert record);
}