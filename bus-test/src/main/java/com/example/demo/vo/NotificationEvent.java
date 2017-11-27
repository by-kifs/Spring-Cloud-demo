package com.example.demo.vo;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

import java.util.Map;

/**
 * Created by cys on 2017/11/23.
 */
public class NotificationEvent extends RemoteApplicationEvent {
    private String eventName;
    private Map<String, String> eventArguments;

    public NotificationEvent() {
    }

    public NotificationEvent(Object source, String originService, String destinationService) {
        super(source, originService, destinationService);
    }

    public String getEventName() {
        return this.eventName;
    }

    public NotificationEvent setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public Map<String, String> getEventArguments() {
        return this.eventArguments;
    }

    public NotificationEvent setEventArguments(Map<String, String> eventArguments) {
        this.eventArguments = eventArguments;
        return this;
    }

    public String getArgument(String name) {
        return (String)this.eventArguments.get(name);
    }
}
