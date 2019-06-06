package com.cobee.mybatis3.query;

/**
 * 分页查询对象，主要封装了currentPage和pageSize属性
 *
 * Created by Administrator on 2019/6/2.
 */
public abstract class PageQuery extends BaseQuery {

    /**
     * 当前页码，要查询的页码
     */
    private Integer currentPage = 1;
    /**
     * 页大小
     */
    private Integer pageSize = 10;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        if (currentPage != null && currentPage < 1)
        {
            this.currentPage = 1;
        }
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize != null && pageSize < 1)
        {
            this.pageSize = 10;
        }
        this.pageSize = pageSize;
    }

    @Override
    protected String getLimitClause() {
        int beginIndex = (currentPage - 1) * pageSize;
        return " LIMIT " + beginIndex + "," + pageSize;
    }
}
