package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Bizqa;
import com.cms.shop.model.base.BizqaCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizqaMapper extends BaseMapper {
    int countByExample(BizqaCriteria example);

    int deleteByExample(BizqaCriteria example);

    int deleteByPrimaryKey(Integer qaId);

    int insert(Bizqa record);

    int insertSelective(Bizqa record);

    List<Bizqa> selectByExample(BizqaCriteria example);

    Bizqa selectByPrimaryKey(Integer qaId);

    int updateByExampleSelective(@Param("record") Bizqa record, @Param("example") BizqaCriteria example);

    int updateByExample(@Param("record") Bizqa record, @Param("example") BizqaCriteria example);

    int updateByPrimaryKeySelective(Bizqa record);

    int updateByPrimaryKey(Bizqa record);
}