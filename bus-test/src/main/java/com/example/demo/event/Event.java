package com.example.demo.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

/**
 * Created by cys on 2018/3/2.
 */
@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class Event {
    private String destinationService;
    private String eventName;
    private Map<String, String> eventArguments;

    public Event() {
    }

    public String getDestinationService() {
        return this.destinationService;
    }

    public Event setDestinationService(String destinationService) {
        this.destinationService = destinationService;
        return this;
    }

    public String getEventName() {
        return this.eventName;
    }

    public Event setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public Map<String, String> getEventArguments() {
        return this.eventArguments;
    }

    public Event setEventArguments(Map<String, String> eventArguments) {
        this.eventArguments = eventArguments;
        return this;
    }
}
