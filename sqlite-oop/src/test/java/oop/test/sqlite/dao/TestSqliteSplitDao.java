package oop.test.sqlite.dao;

import oop.sqlite.annotation.SqliteSql;
import oop.sqlite.base.SqliteBaseDao;
import oop.test.sqlite.entity.TestSqliteSplit;

import java.util.List;

/**
 * Sqlite[test_table]的dao
 *
 * @author 欧阳洁
 * @create 2017-09-29 17:17
 **/
public class TestSqliteSplitDao extends SqliteBaseDao<TestSqliteSplit> {
    /**
     * 构造函数
     */
    public TestSqliteSplitDao() {// 必须要对应实现父类的构造方法
        super(TestSqliteSplit.class);// 表实体对应类
    }

    /**
     * 根据名称模糊查找数据
     *
     * @param entity
     * @return
     */
    @SqliteSql(sql = "select t.create_time publish_time,t.* from this.tableName t where name like '%'||?||'%'", params = {"name"})
    public List<TestSqliteSplit> getByName(TestSqliteSplit entity) {
        //List<T> super.excuteQuery(T entity)，通过params上的参数顺序在entity中获取，并依次填充占位符
        return super.excuteQuery(entity);
    }

    /**
     * 根据名称模糊查找数据并包含id查找
     *
     * @param name
     * @param id
     * @return
     */
    @SqliteSql(sql = "select * from this.tableName where name like '%'||?||'%' or id=?")
    public List<TestSqliteSplit> getByNameOrId(String name, Integer id) {
        //List<T> super.excuteQuery(Object... params)，这里的参数顺序对应自定义的SQL的占位符顺序
        return super.excuteQuery(name, id);
    }
}
