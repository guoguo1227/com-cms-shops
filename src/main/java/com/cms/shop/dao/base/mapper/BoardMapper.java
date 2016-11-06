package com.cms.shop.dao.base.mapper;

import com.cms.shop.dao.base.BaseMapper;
import com.cms.shop.model.base.Board;
import com.cms.shop.model.base.BoardCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoardMapper extends BaseMapper {
    int countByExample(BoardCriteria example);

    int deleteByExample(BoardCriteria example);

    int deleteByPrimaryKey(Integer brdId);

    int insert(Board record);

    int insertSelective(Board record);

    List<Board> selectByExample(BoardCriteria example);

    Board selectByPrimaryKey(Integer brdId);

    int updateByExampleSelective(@Param("record") Board record, @Param("example") BoardCriteria example);

    int updateByExample(@Param("record") Board record, @Param("example") BoardCriteria example);

    int updateByPrimaryKeySelective(Board record);

    int updateByPrimaryKey(Board record);
}