package ru.bse71.learnup.spring.hello.services;

import java.util.List;

/**
 * Application logger
 *
 * @author bse71
 * Created on 02.08.2021
 */
public class SuperService {

    private Logger logger;
    private List<Calculator> calculators;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void setCalculators(List<Calculator> calculators) {
        this.calculators = calculators;
    }

    public void doWork() {
        logger.log("I start working!");
        calculators.forEach(Calculator::calculate);
    }
}
