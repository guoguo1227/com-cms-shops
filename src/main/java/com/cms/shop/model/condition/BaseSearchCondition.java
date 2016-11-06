package com.cms.shop.model.condition;

/**
 * 基础查询条件
 */
public class BaseSearchCondition {

    private Integer limit=30;//每页显示几条数据 默认10
    private Integer currentPage=0;//当前第几页
    private Integer offset=0;//偏移量

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        if(currentPage <= 0) {
            currentPage = 0;
        }
        this.currentPage = currentPage;
        this.offset=this.currentPage*this.limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}
