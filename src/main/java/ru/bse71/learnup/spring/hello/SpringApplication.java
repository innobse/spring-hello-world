package ru.bse71.learnup.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.bse71.learnup.spring.hello.services.SuperService;

/**
 * Main class for app
 *
 * @author bse71
 * Created on 02.08.2021
 */
public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myConfig.xml");

        for (int i = 0; i < 3; i++) {
            System.out.println(
                    context
                            .getBean(SuperService.class)
                            .hashCode());
        }
    }
}
