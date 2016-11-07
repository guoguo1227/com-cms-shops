package com.cms.shop.service;

import com.cms.shop.model.base.Board;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.BoardVo;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.utils.Page;

/**
 * @author : samuel
 * @Description :公告服务接口
 * @Date : 16-11-7
 */
public interface BoardService {

    Page<BoardVo> queryPageByCondition(SearchCondition condition);

    RequestResult addBoard(Board board);

    RequestResult deleteBoardById(Integer id);

    RequestResult queryBoardById(Integer id);

    RequestResult updateBoard(Board board);

}
