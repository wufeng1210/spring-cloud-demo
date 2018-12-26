package com.demo.rabbitmq.constraints;

import com.demo.rabbitmq.validates.ApplicationSortValidate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author: wufeng
 * @date: 2018/8/13 9:42
 * @desrcption: 应用排序的校验
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ApplicationSortValidate.class)
public @interface ValidateApplicationSort {

    String message();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
