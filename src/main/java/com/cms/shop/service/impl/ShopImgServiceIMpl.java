package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.ShopImgMapper;
import com.cms.shop.enums.ImageType;
import com.cms.shop.model.base.ShopImg;
import com.cms.shop.model.base.ShopImgCriteria;
import com.cms.shop.service.ShopImgService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-9
 */
@Service
public class ShopImgServiceIMpl implements ShopImgService{

    @Autowired
    private ShopImgMapper shopImgMapper;

    @Override
    public ShopImg getImgByShopId(Integer id) {
        ShopImg shopImg = null;
        if(null != id){
            List<ShopImg> list = getImgListByShopId(id);
            if(CollectionUtils.isNotEmpty(list)){
                shopImg = list.get(0);
            }
        }
        return shopImg;
    }

    @Override
    public boolean addShopImg(ShopImg img) {
        boolean success = false;
        if(null != img){
            int i = shopImgMapper.insertSelective(img);
            if(i>0){
                success = true;
            }
        }

        return success;
    }

    @Override
    public List<ShopImg> getImgListByShopId(Integer id) {
        List<ShopImg> list = null;
        if(null != id){
            ShopImgCriteria criteria = new ShopImgCriteria();
            criteria.createCriteria().andShopIdEqualTo(id);
            list= shopImgMapper.selectByExample(criteria);
            if(CollectionUtils.isNotEmpty(list)){
                for(ShopImg img:list){
                    if(img.getNewImgName().contains(ImageType.SHOPPIC.getImagePath())){

                    }else{
                        img.setNewImgName(ImageType.SHOPPIC.getImagePath()+img.getNewImgName());
                    }
                }
            }
        }
        return list;
    }

}
