package com.spring.lifecycle.annotation;

import com.spring.lifecycle.model.NewAwareBeanImpl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyDeprecated {
    public Class newImpl() default NewAwareBeanImpl.class;
}
