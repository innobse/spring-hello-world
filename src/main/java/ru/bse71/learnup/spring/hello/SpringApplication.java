package ru.bse71.learnup.spring.hello;

import org.springframework.context.ConfigurableApplicationContext;
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
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("myConfig.xml");
        SuperService service = context.getBean(SuperService.class);

        service.doWork();

        context.registerShutdownHook();
    }
}
