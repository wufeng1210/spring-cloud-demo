package com.demo.rabbitmq.validates;

import com.demo.rabbitmq.constraints.ValidateApplicationSort;
import com.demo.rabbitmq.dto.req.ApplicationSort;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

/**
 * @author: wufeng
 * @date: 2018/8/13 9:45
 * @desrcption: 应用排序的校验的实现类
 */
public class ApplicationSortValidate implements ConstraintValidator<ValidateApplicationSort, List<ApplicationSort>> {

    @Override
    public void initialize(ValidateApplicationSort constraintAnnotation) {

    }

    @Override
    public boolean isValid(List<ApplicationSort> value, ConstraintValidatorContext context) {
        for(ApplicationSort applicationSort : value) {
            Long id = applicationSort.getId();
            Integer sort = applicationSort.getSort();
            if (id == null || sort == null) {
                return false;
            }
        }
        return true;
    }
}
