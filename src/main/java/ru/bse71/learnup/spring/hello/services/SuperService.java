package ru.bse71.learnup.spring.hello.services;

import java.util.Locale;
import java.util.ResourceBundle;

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
        final ResourceBundle resources = ResourceBundle.getBundle("text", Locale.ITALY);
        logger.log(resources.getString("startworking"));
    }
}
