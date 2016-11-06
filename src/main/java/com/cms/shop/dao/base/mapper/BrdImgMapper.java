package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.BrdImg;
import com.cms.shop.model.base.BrdImgCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrdImgMapper extends BaseMapper {
    int countByExample(BrdImgCriteria example);

    int deleteByExample(BrdImgCriteria example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(BrdImg record);

    int insertSelective(BrdImg record);

    List<BrdImg> selectByExample(BrdImgCriteria example);

    BrdImg selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") BrdImg record, @Param("example") BrdImgCriteria example);

    int updateByExample(@Param("record") BrdImg record, @Param("example") BrdImgCriteria example);

    int updateByPrimaryKeySelective(BrdImg record);

    int updateByPrimaryKey(BrdImg record);
}