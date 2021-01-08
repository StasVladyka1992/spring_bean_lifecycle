package com.spring.lifecycle.processor;

import com.spring.lifecycle.annotation.MyDeprecated;
import com.spring.lifecycle.model.AwareBeanImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class ModelBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] names = beanFactory.getBeanDefinitionNames();
        for (String name : names) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            String className = beanDefinition.getBeanClassName();
//            try {
//                if (className != null) {
//                    Class originalClass = Class.forName(className);
//                    MyDeprecated annotation = (MyDeprecated) originalClass.getAnnotation(MyDeprecated.class);
//                    if (annotation != null) {
//                        System.out.println("BeanFactoryPostProcessor was called for: " + originalClass);
//                        Class newClass = annotation.newImpl();
//                        beanDefinition.setBeanClassName(newClass.getName());
//                    }
//                }
//            } catch (ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
            try {
                if(className!=null && Class.forName(className).equals(AwareBeanImpl.class)){
//                    Class originalClass = Class.forName(className);
                    System.out.println("beanFactoryPostProcessor was called for awareBeanImpl");
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
