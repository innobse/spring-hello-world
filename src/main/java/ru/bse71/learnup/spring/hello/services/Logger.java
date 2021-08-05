package ru.bse71.learnup.spring.hello.services;

import org.springframework.context.ApplicationListener;
import ru.bse71.learnup.spring.hello.events.ServiceWorkEvent;

/**
 * Application logger
 *
 * @author bse71
 * Created on 02.08.2021
 */
public class Logger implements ApplicationListener<ServiceWorkEvent> {

    public void log(Object o) {
        System.out.println(o);
    }

    @Override
    public void onApplicationEvent(ServiceWorkEvent event) {
        final ServiceWorkEvent.Info info = (ServiceWorkEvent.Info) event.getSource();
        log(
                String.format(
                        "Поймал событие: %s. \nДополнительная информация: %s",
                        info.getTitle(), info.getInfo()));
    }
}
