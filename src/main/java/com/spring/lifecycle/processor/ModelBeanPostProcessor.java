package com.spring.lifecycle.processor;

import com.spring.lifecycle.model.AwareBeanImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class ModelBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof AwareBeanImpl) {
            System.out.println(beanName + " postProcessor before initialization was called");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof AwareBeanImpl) {
            System.out.println(beanName + " postProcessor after initialization was called");
        }
        return bean;
    }
}
