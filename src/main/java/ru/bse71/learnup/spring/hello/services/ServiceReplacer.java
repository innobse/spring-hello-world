package ru.bse71.learnup.spring.hello.services;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Description
 *
 * @author bse71
 * Created on 04.08.2021
 * @since
 */
public class ServiceReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("ВНЕЗАПНО!");
        return obj;
    }
}
