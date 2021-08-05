package ru.bse71.learnup.spring.hello.services;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import ru.bse71.learnup.spring.hello.events.ServiceWorkEvent;

/**
 * Application logger
 *
 * @author bse71
 * Created on 02.08.2021
 */
public class SuperService implements ApplicationContextAware {

    private static final int TIMEOUT_WORK = 1000;

    private ApplicationContext ctx;

    public void doWork() {
        ctx.publishEvent(
                new ServiceWorkEvent(
                        ServiceWorkEvent.Info.of(
                                "SuperService начал работу",
                                "Что за работа - пока непонятно")));

        try {
            Thread.sleep(TIMEOUT_WORK);
        } catch (InterruptedException e) {}
        finally {
            ctx.publishEvent(
                    new ServiceWorkEvent(
                            ServiceWorkEvent.Info.of(
                                    "SuperService закончил работу",
                                    "Все было классно, работа на отлично")));
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
