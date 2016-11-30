package com.cms.shop.model.condition;

import java.util.Date;

/**
 * 搜索条件：通用
 */
public class SearchCondition extends BaseSearchCondition {

    //搜索文字内容
    private String searchContent ;

    private String name; //名称

    private Integer id; // 查询详情id

    private Integer fId; //标记id

    private Integer userId ; //用户Id

    //开始时间
    private Date startTime;
    //结束时间
    private Date endTime;

    private Integer idGreaterThan; //大于某id

    private Integer idLessThan; //小于某id

    private Integer status ; //状态

    private Integer checkStatus; //审核状态

    private Integer districtId; //所在区域id

    private Integer hotId; //商铺类型

    private Integer areaId; //面积大小

    private String floor ; //层数

    private Integer type; //热门类型,广告类型

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getHotId() {
        return hotId;
    }

    public void setHotId(Integer hotId) {
        this.hotId = hotId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIdGreaterThan() {
        return idGreaterThan;
    }

    public void setIdGreaterThan(Integer idGreaterThan) {
        this.idGreaterThan = idGreaterThan;
    }

    public Integer getIdLessThan() {
        return idLessThan;
    }

    public void setIdLessThan(Integer idLessThan) {
        this.idLessThan = idLessThan;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }
}
