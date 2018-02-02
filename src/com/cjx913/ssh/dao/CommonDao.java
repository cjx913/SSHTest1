package com.cjx913.ssh.dao;

import java.util.List;

public interface CommonDao<T> {
    // 添加
    public void save(T t);
    // 更新
    public void update(T t);
    // 保存或更新(代理主键：如果没有OID将执行save，如果有OID将执行update)
    public void saveOrUpdate(T t);
    // 删除
    public void delete(T t);
    // 通过id查询
    public T findById(java.io.Serializable id);
    //查询所有
    public List<T> findAll();
    /**
     * 带有条件查询所有
     * @param condition 条件语句 （where之后的语句）
     * * 格式： and 属性 关键字 ?
     * * 例如：and name like ?
     * @param params 条件
     */
    public List<T> findAll(String condition, Object... params);
    //查询分页数据
    public List<T> findAllWithPage(String conditionHQL, Object[] params, int startIndex, int pageSize);
    //查询总记录数
    public int getTotalRecord();
}
