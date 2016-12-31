package com.cms.shop.service.impl;

import com.cms.shop.constants.ShopConstant;
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
import java.util.Date;
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
            }else{
                cri.andBrdTypeGreaterThanOrEqualTo(BoardTypeEnum.NEWS.getKey());
            }
            //状态
            if(null != condition.getCheckStatus()){
                cri.andBrdStatusEqualTo(condition.getCheckStatus());
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
                            String img = brdImgExtMapper.selectImgByBrdId(board.getBrdId());
                            if(!StringUtils.isBlank(img)){
                                vo.setImg(ImageType.BOARD.getImagePath()+img);
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
    public RequestResult addBoard(Board board,String img) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != board){
            board.setCreateDate(new Date());
            board.setEditTag(ShopConstant.EDIT_TAG_LOCK);
            board.setBrdStatus(CheckStatusEnum.AUDIT.getKey());
            int i = boardMapper.insertSelective(board);
            if(i>0){
                if(null != board.getBrdId() && !StringUtils.isBlank(img)){
                    BrdImg brdImg = new BrdImg();
                    brdImg.setFileName(img);
                    brdImg.setBrdId(board.getBrdId());
                    brdImgMapper.insertSelective(brdImg);
                }
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
            //删除关联图片
            BrdImgCriteria criteria = new BrdImgCriteria();
            criteria.createCriteria().andBrdIdEqualTo(id);
            brdImgMapper.deleteByExample(criteria);

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
    public RequestResult updateBoardStatus(Integer id, boolean ifPass) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            Board board = boardMapper.selectByPrimaryKey(id);
            if(null != board){
                if(ifPass){
                    board.setBrdStatus(CheckStatusEnum.PASS.getKey());
                }else{
                    board.setBrdStatus(CheckStatusEnum.NOPASS.getKey());
                }
                int i = boardMapper.updateByPrimaryKey(board);
                if(i>0){
                    success = true;
                }
            }else{
                message = "该公告已删除";
            }

        }else{
            message = "id不可为空";
        }
        result.setMessage(message);
        result.setSuccess(success);
        return result;    }

    @Override
    public List<Board> queryOnList(BoardTypeEnum typeEnum,SearchCondition condition) {
        BoardCriteria criteria = new BoardCriteria();
        BoardCriteria.Criteria cri = criteria.createCriteria();
        cri.andBrdStatusEqualTo(CheckStatusEnum.PASS.getKey());

        //类型
        if(null != typeEnum){
            cri.andBrdTypeEqualTo(typeEnum.getKey());
        }
        else{
            cri.andBrdTypeGreaterThanOrEqualTo(BoardTypeEnum.NEWS.getKey());
        }
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

        boolean imgFlag = false;
        List<BoardVo> list = new ArrayList<>();
        BoardCriteria criteria = new BoardCriteria();
        BoardCriteria.Criteria cri = criteria.createCriteria();
        cri.andBrdStatusEqualTo(CheckStatusEnum.PASS.getKey());


        //查询首页图片
        if(null != condition.getType()){
            if(condition.getType().equals(1)){
                imgFlag = true;
            }
        }
        if(!imgFlag){
            //类型
            if(null != typeEnum){
                cri.andBrdTypeEqualTo(typeEnum.getKey());
            }
        }
        criteria.setOrderByClause(" BRD_ID desc ");

        criteria.setLimitStart(0);
        criteria.setLimitEnd(6);
        if (null != condition.getLimit()){
            criteria.setLimitEnd(condition.getLimit());
        }

        List<Board> boardList = new ArrayList<>();
        if(imgFlag){

            //北翼要闻
            BoardCriteria newsCri = new BoardCriteria();
            newsCri.createCriteria().andBrdStatusEqualTo(CheckStatusEnum.PASS.getKey()).andBrdTypeEqualTo(BoardTypeEnum.NEWS.getKey());
            newsCri.setLimitStart(0);
            newsCri.setLimitEnd(2);
            newsCri.setOrderByClause(" BRD_ID desc ");

            List<Board> newsList= boardMapper.selectByExample(newsCri);
            if(CollectionUtils.isNotEmpty(newsList)){
                boardList.addAll(newsList);
            }
            //商家动态
            BoardCriteria businessCri = new BoardCriteria();
            businessCri.createCriteria().andBrdStatusEqualTo(CheckStatusEnum.PASS.getKey()).andBrdTypeEqualTo(BoardTypeEnum.BUSINESS.getKey());
            businessCri.setLimitStart(0);
            businessCri.setLimitEnd(2);
            businessCri.setOrderByClause(" BRD_ID desc ");
            List<Board> businessList= boardMapper.selectByExample(businessCri);
            if(CollectionUtils.isNotEmpty(businessList)){
                boardList.addAll(businessList);
            }
        }else{
            boardList = boardMapper.selectByExample(criteria);
        }

        if(CollectionUtils.isNotEmpty(boardList)){
            for(Board b : boardList){
                BoardVo vo = new BoardVo();
                try {
                    BeanUtilExt.copyProperties(vo,b);

                    String img = brdImgExtMapper.selectImgByBrdId(b.getBrdId());
                    if(!StringUtils.isBlank(img)){
                        if(!img.contains(ImageType.BOARD.getImagePath())){
                            vo.setImg(ImageType.BOARD.getImagePath()+img);
                        }else{
                            vo.setImg(img);
                        }
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
