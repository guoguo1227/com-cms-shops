package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.KeywordMapper;
import com.cms.shop.model.base.Keyword;
import com.cms.shop.model.base.KeywordCriteria;
import com.cms.shop.service.KeywordService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-20
 */
@Service
public class KeywordServiceImpl implements KeywordService{

    @Autowired
    private KeywordMapper keywordMapper;

    @Override
    public List<Keyword> queryHotKeyWord() {
        KeywordCriteria cri = new KeywordCriteria();
        cri.setOrderByClause(" count desc ");
        cri.setLimitStart(0);
        cri.setLimitEnd(3);
        List<Keyword> list = keywordMapper.selectByExample(cri);

        return list;
    }

    @Override
    public boolean addKeyword(String keyword) {
        boolean success = false;
        Date now =new Date();
        if(!StringUtils.isBlank(keyword)){
            KeywordCriteria cri = new KeywordCriteria();
            cri.createCriteria().andWordEqualTo(keyword);
            List<Keyword> list = keywordMapper.selectByExample(cri);
            if(CollectionUtils.isNotEmpty(list)){
                Keyword word = list.get(0);
                if(null != word.getCount()){
                    Integer count  = word.getCount();
                    if(count > Integer.MAX_VALUE-1){
                        count = Integer.MAX_VALUE;
                    }
                    word.setCount(count);
                    word.setUpdatetime(now);
                    int i = keywordMapper.updateByPrimaryKeySelective(word);
                    if(i>0){
                        success = true;
                    }
                }
            }else{
                Keyword k = new Keyword();
                k.setWord(keyword);
                k.setCount(1);
                k.setCreatetime(now);
                int i = keywordMapper.insertSelective(k);
                if(i>0){
                    success = true;
                }
            }
        }
        return success;
    }
}
