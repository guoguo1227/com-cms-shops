package com.cms.shop.service.impl;

import com.cms.shop.dao.base.ext.BrdImgExtMapper;
import com.cms.shop.dao.base.mapper.BoardMapper;
import com.cms.shop.dao.base.mapper.BrdImgMapper;
import com.cms.shop.enums.BoardTypeEnum;
import com.cms.shop.enums.CheckStatusEnum;
import com.cms.shop.enums.ImageType;
import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.BoardVo;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.BoardService;
import com.cms.shop.service.SysUserService;
import com.cms.shop.utils.BeanUtilExt;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-7
 */
@Service
public class BoardServiceImpl implements BoardService{

    private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);

    @Autowired
    private BoardMapper boardMapper;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private BrdImgMapper brdImgMapper;

    @Autowired
    private BrdImgExtMapper brdImgExtMapper;

    @Override
    public Page<BoardVo> queryPageByCondition(SearchCondition condition) {
        Page<BoardVo> page = null;
        List<BoardVo> boardVoList = new ArrayList<>();
        if(null != condition){
            page = new Page<>();
            page.setPageSize(condition.getLimit());

            BoardCriteria criteria = new BoardCriteria();
            BoardCriteria.Criteria cri = criteria.createCriteria();
            criteria.setOrderByClause(" CREATE_DATE desc ");
            //id
            if(null != condition.getId()){
                cri.andBrdIdEqualTo(condition.getId());
            }
            //类型
            if(null != condition.getType()){
                cri.andBrdTypeEqualTo(condition.getType());
            }
            int count = boardMapper.countByExample(criteria);

            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Board> boardList = boardMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(boardList)){
                    for(Board board : boardList){
                        BoardVo vo = new BoardVo();
                        try {
                            BeanUtilExt.copyProperties(vo,board);
                            SysUser user = sysUserService.queryUserById(board.getCreId());
                            if(null != user){
                                vo.setUserName(user.getInfoName());
                            }
                            boardVoList.add(vo);
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }

                    }
                    page.setPageData(boardVoList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public RequestResult addBoard(Board board) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != board){
            int i = boardMapper.insertSelective(board);
            if(i>0){
                success = true;
            }
        }else{
            message = "公告信息不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult deleteBoardById(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            int i = boardMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }else{
            message = "id不可为空";
        }
        result.setMessage(message);
        result.setSuccess(success);
        return result;
    }

    @Override
    public RequestResult queryBoardById(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        Board board = null;
        if(null != id){
            board = boardMapper.selectByPrimaryKey(id);
            if(null != board){
                success = true;
            }
        }else{
            message = "id不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        result.setData(board);
        return result;
    }

    @Override
    public RequestResult updateBoard(Board board) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != board && null != board.getBrdId()){
            int i = boardMapper.updateByPrimaryKeySelective(board);
            if(i>0){
                success = true;
            }
        }else{
            message = "id不可为空";
        }
        result.setMessage(message);
        result.setSuccess(success);
        return result;
    }

    @Override
    public List<Board> queryOnList(BoardTypeEnum typeEnum,SearchCondition condition) {
        BoardCriteria criteria = new BoardCriteria();
        criteria.createCriteria().andBrdTypeEqualTo(typeEnum.getKey()).andBrdStatusEqualTo(CheckStatusEnum.PASS.getKey());

        criteria.setOrderByClause(" BRD_ID desc ");
        criteria.setLimitStart(0);
        criteria.setLimitEnd(6);
        if (null != condition){
            criteria.setLimitEnd(condition.getLimit());
        }

        List<Board> list = boardMapper.selectByExample(criteria);

        return list;
    }

    @Override
    public List<BoardVo> queryVoOnList(BoardTypeEnum typeEnum,SearchCondition condition) {

        List<BoardVo> list = new ArrayList<>();
        BoardCriteria criteria = new BoardCriteria();
        criteria.createCriteria().andBrdTypeEqualTo(typeEnum.getKey()).andBrdStatusEqualTo(CheckStatusEnum.PASS.getKey());

        criteria.setOrderByClause(" BRD_ID desc ");

        criteria.setLimitStart(0);
        criteria.setLimitEnd(6);
        if (null != condition){
            criteria.setLimitEnd(condition.getLimit());
        }
        List<Board> boardList = boardMapper.selectByExample(criteria);

        if(CollectionUtils.isNotEmpty(boardList)){
            for(Board b : boardList){
                BoardVo vo = new BoardVo();
                try {
                    BeanUtilExt.copyProperties(vo,b);

                    String img = brdImgExtMapper.selectImgByBrdId(b.getBrdId());
                    if(!StringUtils.isBlank(img)){
                        vo.setImg(ImageType.BOARD.getImagePath()+img);
                        list.add(vo);
                    }
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
