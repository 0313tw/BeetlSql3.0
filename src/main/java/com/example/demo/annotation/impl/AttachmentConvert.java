package com.example.demo.annotation.impl;

import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.annotation.builder.AttributeConvert;
import org.beetl.sql.core.ExecuteContext;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

/**
 * Author: 陈艺博
 * Date:  2020-10-14 16:12
 * Description:
 */
@Slf4j
public class AttachmentConvert implements AttributeConvert {

    Charset utf8 = StandardCharsets.UTF_8;

    //todo 如果entity中的属性不包含在查询数据中, 则不执行该方法
    public Object toAttr(ExecuteContext ctx, Class clazz, String attrName, ResultSet resultSet, int index) throws SQLException {
        log.error("----AttachmentConvert toAttr");
        var targetId = resultSet.getString(1);
        var targetType = clazz;
        if (targetId != null) {
            return null;
        }

        // todo 想在这里进行sql查询, 但是这里不能sqlManger
        return new String(Base64.getDecoder().decode(targetId), utf8);
    }

}
