package com.cms.shop.dao.base.ext;

import com.cms.shop.model.ext.ShopPvExt;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by samuel on 17-1-10.
 */
public interface ShopPvExtMapper {

    @Select("select DATE_FORMAT(b.create_Date,'%Y%u') date,b.type,count(*) count from  shoppv b\n"+
            "WHERE b.type=#{type}\n"+
            "GROUP BY date\n"+
            "ORDER BY b.create_Date;\n")
    public List<ShopPvExt> queryClickWeekByType(@Param("type") Integer type);


    @Select("select DATE_FORMAT(b.create_Date,'%Y%u') date,b.type,count(*) count from  shoppv b\n"+
            "WHERE b.type=#{type} and relate_type = #{relateType} \n"+
            "GROUP BY date\n"+
            "ORDER BY b.create_Date;\n")
    public List<ShopPvExt> queryClickWeekByTypeAndRelate(@Param("type") Integer type,@Param("relateType") Integer relateType);


    @Select("select DATE_FORMAT(b.CREATE_DATE,'%Y%u') date,5,count(*) count from  qa b\n"+
            "GROUP BY date\n"+
            "ORDER BY b.CREATE_DATE;\n")
    public List<ShopPvExt> queryQaWeekByType();


    @Select("select DATE_FORMAT(b.create_Date,'%m') date,b.type,count(*) count from  shoppv b\n"+
            "WHERE b.type=#{type}\n"+
            "GROUP BY date\n"+
            "ORDER BY b.create_Date;\n")
    public List<ShopPvExt> queryClickMonthByType(@Param("type") Integer type);


    @Select("select DATE_FORMAT(b.create_Date,'%m') date,b.type,count(*) count from  shoppv b\n"+
            "WHERE b.type=#{type} and relate_type = #{relateType} \n"+
            "GROUP BY date\n"+
            "ORDER BY b.create_Date;\n")
    public List<ShopPvExt> queryClickMonthByTypeAndRelate(@Param("type") Integer type,@Param("relateType") Integer relateType);


    @Select("select DATE_FORMAT(b.CREATE_DATE,'%m') date,5,count(*) count from  qa b\n"+
            "GROUP BY date\n"+
            "ORDER BY b.CREATE_DATE;\n")
    public List<ShopPvExt> queryQaMonthByType();
}
