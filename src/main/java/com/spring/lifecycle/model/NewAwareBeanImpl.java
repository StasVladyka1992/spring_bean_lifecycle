package com.spring.lifecycle.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("new")
//@Primary
public class NewAwareBeanImpl {
//        implements ApplicationContextAware, BeanNameAware, BeanFactoryAware, InitializingBean,
//        DisposableBean, AwareBeanInterface {

//    public NewAwareBeanImpl() {
//        System.out.println("newAwareBeanImpl constructor was called");
//    }
//
//    @Override
//    public void setBeanName(String s) {
//        //если в beanFactoryPostProcessor подменить класс, то на другой, то имя все равно останется старое...
//        //a поменять имя нельзя. Видимо, чтобы не перезатереть уже существующее значение в мапе с таким же именем.
//        System.out.println("Bean name was set - " + s);
//    }
//
//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("BeanFactory contains bean: " + beanFactory.containsBean("newAwareBeanImpl"));
//        System.out.println("newAwareBeanImpl is singleton: " + beanFactory.isSingleton("newAwareBeanImpl"));
//        StringBuilder sb = new StringBuilder();
//        for (String alias : beanFactory.getAliases("newAwareBeanImpl")) {
//            sb.append(alias).append(" ");
//        }
//        System.out.println("newAwareBeanImpl has aliases: " + sb);
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        StringBuilder sb = new StringBuilder();
//        for (String beanDefinition :
//                applicationContext.getBeanDefinitionNames()) {
//            sb.append(beanDefinition).append(", ");
//        }
//        System.out.println("application context has bean beanDefinitions: " + sb.toString());
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("newAwareBeanImpl destroy method was called");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("newAwareBeanImpl init method was called");
//    }

}
