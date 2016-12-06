package com.cms.shop.controller;

import com.cms.shop.model.base.Board;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.BoardVo;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.BoardService;
import com.cms.shop.utils.BeanUtilExt;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.InvocationTargetException;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-7
 */
@Controller
@RequestMapping("board")
public class BoardController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    @RequestMapping("page")
    @ResponseBody
    public String queryAdvertPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<BoardVo> page =  boardService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("query")
    @ResponseBody
    public String queryAdById(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            result =  boardService.queryBoardById(id);
        }
        return gson.toJson(result);
    }

    @RequestMapping("delete")
    @ResponseBody
    public String deleteAdById(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            result =  boardService.deleteBoardById(id);
        }
        return gson.toJson(result);
    }

    @RequestMapping("update")
    @ResponseBody
    public String updateAd(Board board){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != board){
            result =  boardService.updateBoard(board);
        }
        return gson.toJson(result);
    }

    /**
     * 添加公告
     * @param vo
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public String addBoard(BoardVo vo){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != vo){
            Board board = new Board();
            BoardVo boardVo = new BoardVo();
            try {
                BeanUtilExt.copyProperties(boardVo,vo);
                result =  boardService.addBoard(board,vo.getImg());
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return gson.toJson(result);
    }

}
