package ru.bse71.learnup.spring.hello.events;

import org.springframework.context.ApplicationEvent;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
public class ServiceWorkEvent extends ApplicationEvent {

    public ServiceWorkEvent(Info info) {
        super(info);
    }

    public static class Info {
        public final String title;
        public final String info;

        private Info(String title, String info) {
            this.title = title;
            this.info = info;
        }

        public String getTitle() {
            return title;
        }

        public String getInfo() {
            return info;
        }

        public static Info of(String title, String info) {
            return new Info(title, info);
        }
    }
}
