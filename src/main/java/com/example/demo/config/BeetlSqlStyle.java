package com.example.demo.config;

import org.beetl.sql.clazz.kit.KeyWordHandler;
import org.beetl.sql.core.db.MySqlStyle;

/**
 * 重写MySqlStyle,
 * 目的是在表名和字段名上添加 反引号, 解决mysql关键字和程序中的属性名冲突问题
 */
public class BeetlSqlStyle extends MySqlStyle {

    public BeetlSqlStyle() {
        this.keyWordHandler = new KeyWordHandler() {
            @Override
            public String getTable(String tableName) {
                return "`" + tableName + "`";

            }

            @Override
            public String getCol(String colName) {
                return "`" + colName + "`";
            }

        };
    }
}