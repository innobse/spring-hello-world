package ru.bse71.learnup.spring.hello.services;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Application logger
 *
 * @author bse71
 * Created on 02.08.2021
 */
public class SuperService implements ApplicationContextAware {

    private Logger logger;
    private ApplicationContext ctx;

    public SuperService(Logger logger) {
        this.logger = logger;
    }

    public void doWork() {
        final Locale locale = Locale.US;
        logger.log(ctx.getMessage("hello", new String[]{"LearnUp"}, locale));
        logger.log(ctx.getMessage("startworking", new Object[0], locale));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
