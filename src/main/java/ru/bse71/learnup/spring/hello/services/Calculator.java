package ru.bse71.learnup.spring.hello.services;

/**
 * Description
 *
 * @author bse71
 * Created on 04.08.2021
 * @since
 */
public interface Calculator {

    default void calculate() {
        System.out.println(getClass().getSimpleName());
    }
}
