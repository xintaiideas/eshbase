package com.zhou.hbase;

import java.lang.annotation.*;

/**
 * @Author guoyichao
 * @Descriptions: 自定义注解，用于获取table
 * @Date: Created in 2020/6/03
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE })
@Inherited
public @interface HbaseTable {
    String tableName() default "";
}
