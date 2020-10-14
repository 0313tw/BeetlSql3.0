package com.example.demo.annotation;

import com.example.demo.annotation.impl.Base64Convert;
import org.beetl.sql.annotation.builder.Builder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: 陈艺博
 * Date:  2020-10-14 13:32
 * Description: 自定义Base64加密注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.FIELD})
@Builder(Base64Convert.class)
public @interface Base64 {
}
