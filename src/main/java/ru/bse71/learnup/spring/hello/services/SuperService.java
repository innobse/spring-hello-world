package ru.bse71.learnup.spring.hello.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Application logger
 *
 * @author bse71
 * Created on 02.08.2021
 */
public class SuperService implements BeanNameAware, DisposableBean, ApplicationContextAware, InitializingBean {

    private Logger logger;

    public SuperService(Logger logger) {
        this.logger = logger;
    }

    public void doWork() {
        logger.log("I start working!");
    }

    public void init() {
        logger.log("init");
    }

    public void destroy() {
        logger.log("disposable destroy");
    }

    public void destroyCustom() {
        logger.log("custom destroy");
    }

    @Override
    public void setBeanName(String s) {
        logger.log("set name: " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.log("set context: " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (logger == null) System.out.println("Logger is null!");
        else logger.log("Logger: " + logger);
    }


}
