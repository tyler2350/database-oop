package oop.sqlite.base;

import java.util.List;

/**
 * Sqlite基础Entity
 *
 * @author 欧阳洁
 * @create 2017-09-30 10:41
 **/
public class SqliteBaseEntity {
    private String currentSql;

    private List<Object> currentParam;

    private String needCreateBefSql;

    public Class getCurrentClass(){
        return this.getClass();
    }

    public String getCurrentSql() {
        return currentSql;
    }

    public void setCurrentSql(String currentSql) {
        this.currentSql = currentSql;
    }

    public List<Object> getCurrentParam() {
        return currentParam;
    }

    public void setCurrentParam(List<Object> currentParam) {
        this.currentParam = currentParam;
    }

    public String getNeedCreateBefSql() {
        return needCreateBefSql;
    }

    public void setNeedCreateBefSql(String needCreateBefSql) {
        this.needCreateBefSql = needCreateBefSql;
    }
}
