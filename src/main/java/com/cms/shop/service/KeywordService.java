package com.cms.shop.service;

import com.cms.shop.model.base.Keyword;

import java.util.List;

/**
 * @author : samuel
 * @Description : 搜索词服务
 * @Date : 16-11-20
 */
public interface KeywordService {

    public List<Keyword> queryHotKeyWord();

    public boolean addKeyword(String keyword);
}
