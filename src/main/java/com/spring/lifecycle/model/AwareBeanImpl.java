package com.spring.lifecycle.model;

import com.spring.lifecycle.annotation.MyDeprecated;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@MyDeprecated
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AwareBeanImpl implements ApplicationContextAware, BeanNameAware, BeanFactoryAware, InitializingBean,
        DisposableBean, AwareBeanInterface {
    public AwareBeanImpl() {
        System.out.println("awareBeanImpl constructor was called");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name was set - " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("BeanFactory contains bean: " + beanFactory.containsBean("awareBeanImpl"));
//        System.out.println("awareBeanImpl is singleton: " + beanFactory.isSingleton("awareBeanImpl"));
        StringBuilder sb = new StringBuilder();
//        for (String alias : beanFactory.getAliases("awareBeanImpl")) {
//            sb.append(alias).append(" ");
//        }
//        System.out.println("awareBeanImpl has aliases: " + sb);
        System.out.println("setBeanFactory was called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        StringBuilder sb = new StringBuilder();
        for (String beanDefinition :
                applicationContext.getBeanDefinitionNames()) {
            sb.append(beanDefinition).append(", ");
        }
//        System.out.println("awareBeanImpl has bean beanDefinitions: " + sb.toString());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("awareBeanImpl destroy method was called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("awareBeanImpl init method was called");
    }
}
