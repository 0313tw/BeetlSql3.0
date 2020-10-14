package com.example.demo.annotation.impl;

import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.annotation.builder.AttributeConvert;
import org.beetl.sql.clazz.kit.BeanKit;
import org.beetl.sql.core.ExecuteContext;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

/**
 * Author: 陈艺博
 * Date:  2020-10-14 13:34
 * Description: 实现Base64注解,这样保证name字段存入数据库是经过base64加密，取出是base64解密
 */
@Slf4j
public class Base64Convert implements AttributeConvert {

    Charset utf8 = StandardCharsets.UTF_8;

    /**
     * @param ctx      上下文
     * @param clazz    注解所在类对象.class
     * @param attrName 注解所在属性名称
     * @param dbValue  注解所在类对象
     */
    public Object toDb(ExecuteContext ctx, Class clazz, String attrName, Object dbValue) {
        log.error("----base64 toDB");
        // 获取对象的对应属性值
        var value = (String) BeanKit.getBeanProperty(dbValue, attrName);
        if (null == value) {
            return null;
        }
        var base64 = Base64.getEncoder().encode(value.getBytes(utf8));
        return new String(base64, utf8);
    }

    public Object toAttr(ExecuteContext ctx, Class clazz, String attrName, ResultSet resultSet, int index) throws SQLException {
        log.error("----base64 toAttr");
        var value = resultSet.getString(index);
        if (null == value) {
            return null;
        }
        return new String(Base64.getDecoder().decode(value), utf8);
    }
}
