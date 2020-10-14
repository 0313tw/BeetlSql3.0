package com.example.demo.annotation;

import com.example.demo.annotation.impl.AttachmentConvert;
import org.beetl.sql.annotation.builder.Builder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: 陈艺博
 * Date:  2020-10-14 16:10
 * Description: 获取附件信息
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.FIELD})
@Builder(AttachmentConvert.class)
public @interface GetFile {
}
