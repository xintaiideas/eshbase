package com.zhou.hbase;

import java.lang.annotation.*;

/**
 * @Author guoyichao
 * @Descriptions: 自定义注解，用于描述字段所属的 family与qualifier. 也就是hbase的列与列簇
 * @Date: Created in 2020/6/03
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD })
@Inherited
public @interface HbaseColumn {

    String family() default "";

    String qualifier() default "";

    boolean timestamp() default false;
}
