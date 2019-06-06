package com.cobee.mybatis3.query;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果对象，分页查询返回的对象。
 *     封装分页的结果数据：结果集/首页/上一页/下一页/尾页/当前页/页大小/总记录数/
 *
 * Created by Administrator on 2019/6/2.
 */
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -1055103198303334897L;

    /**
     * 结果集，SQL查询出来
     */
    private List<T> dataList;

    /**
     * 总记录数，SQL查询出来
     */
    private Integer totalCount;

    /**
     * 首页
     */
    private Integer firstPage = 1;

    /**
     * 当前页，前端用户传入
     */
    private Integer currentPage;
    /**
     * 页大小，前端用户传入
     */
    private Integer pageSize;

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getFirstPage() {
        return firstPage;
    }

    /**
     * 获取上一页，计算得出
     *
     * @return
     */
    public Integer getPrePage() {
        return currentPage - 1 >= 1 ? currentPage - 1 : 1;
    }

    /**
     * 获取下一页，计算得出
     *
     * @return
     */
    public Integer getNextPage() {
        return currentPage + 1 <= getTotalPage() ? currentPage + 1 : getTotalPage();
    }

    /**
     * 获取总页数，也是尾页
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
