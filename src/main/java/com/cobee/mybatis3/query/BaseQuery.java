package com.cobee.mybatis3.query;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 父类查询对象，封装了条件的组合与QuerySql的拼接
 *
 * Created by Administrator on 2019/6/1.
 */
public abstract class BaseQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<String> conditionList = null;

    /**
     * 获取查询sql语句，对应于映射文件中的${querySql}
     * 相当于where子句的内容
     *
     * @return
     */
    public String getQuerySql()
    {
        StringBuffer sbuff = new StringBuffer();
        custermizedQuery();
        if (CollectionUtils.isNotEmpty(conditionList))
        {
            for (int i = 0; i < conditionList.size(); i++)
            {
                if (i == 0)
                {
                    sbuff.append(" WHERE ");
                }
                else
                {
                    sbuff.append(" AND ");
                }
                sbuff.append(conditionList.get(i));
            }
        }

        String limitClause = getLimitClause();
        if (StringUtils.isNotBlank(limitClause))
        {
            sbuff.append(limitClause);
        }

//        if (log.isDebugEnabled())
//        {
//            log.debug(">>>>>>>>>>>>> [Query/PageQuery Sql]:" + sbuff.toString());
//        }
        return sbuff.toString();
    }

    /**
     * 需要子类实现，用于增加具体的比较条件
     */
    protected abstract void custermizedQuery();

    /**
     * 分页查询对象子类，需实现，返回limit子句
     *
     * @return
     */
    protected String getLimitClause(){
        return "";
    };

    /**
     * 子类调用此方法把构建好的条件放入到条件集合中
     *
     * @param condition
     */
    protected void addCondition(String condition)
    {
        if (StringUtils.isBlank(condition))
        {
            return;
        }
        if (conditionList == null)
        {
            //conditionList = Lists.newArrayList();
            conditionList = new ArrayList<>();
        }
        conditionList.add(condition);
    }

}
