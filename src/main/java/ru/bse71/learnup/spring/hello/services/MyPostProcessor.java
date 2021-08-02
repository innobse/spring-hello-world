package ru.bse71.learnup.spring.hello.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Post Processor
 *
 * @author bse71
 * Created on 02.08.2021
 * @since
 */
public class MyPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BEFORE INIT: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AFTER INIT: " + beanName);
        return bean;
    }
}
