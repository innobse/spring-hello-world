package ru.bse71.learnup.spring.hello.services;

/**
 * Application logger
 *
 * @author bse71
 * Created on 02.08.2021
 */
public class SuperService {

    private Logger logger;

    public SuperService(Logger logger) {
        this.logger = logger;
    }

    public void doWork() {
        logger.log("I start working!");
    }
}
