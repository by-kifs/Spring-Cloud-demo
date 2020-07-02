package com.lasi.demo.event;

import com.lasi.demo.vo.NotificationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created by cys on 2017/11/23.
 */
@Component
public class EventFactory {
    @Autowired
    private ApplicationContext applicationContext;

    public EventFactory() {
    }

    public EventFactory.EventBuilder eventTo(String destination) {
        return new EventFactory.EventBuilder(destination);
    }

    public class EventBuilder {
        private NotificationEvent event;

        public EventBuilder(String destination) {
            this.event = new NotificationEvent(this, EventFactory.this.applicationContext.getId(), destination);
            this.event.setEventArguments(new HashMap());
        }

        public EventFactory.EventBuilder name(String name) {
            this.event.setEventName(name);
            return this;
        }

        public EventFactory.EventBuilder arg(String name, String value) {
            this.event.getEventArguments().put(name, value);
            return this;
        }

        public void send() {
            EventFactory.this.applicationContext.publishEvent(this.event);
        }

        public NotificationEvent build() {
            return this.event;
        }
    }
}
