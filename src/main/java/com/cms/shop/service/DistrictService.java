package com.cms.shop.service;

import com.cms.shop.model.base.District;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.utils.Page;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

/**
 * @author : samuel
 * @Description :地区服务
 * @Date : 16-11-6
 */
public interface DistrictService {

    Page<District> queryListByCondition(SearchCondition condition);

    List<District> queryAll();

    /**
     * 上移下移
     * @param id
     * @param upflag
     * @return
     */
    public boolean updatePriority(Integer id,boolean upflag);

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean deleteDistrictById(Integer id);

    public boolean addDistrict(District district);

    public boolean updateDistrict(District district);

    public District queryDistrictById(Integer id);
}
