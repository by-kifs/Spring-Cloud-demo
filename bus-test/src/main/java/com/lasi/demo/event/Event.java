package com.lasi.demo.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    public Event addEventArgument(String name, String value) {
        if(Objects.isNull(this.eventArguments)) {
            this.eventArguments = new HashMap();
        }

        this.eventArguments.put(name, value);
        return this;
    }

    public Integer getInt(String name) {
        String value = (String)this.eventArguments.get(name);
        return Objects.isNull(value)?null:Integer.valueOf(value);
    }

    public Integer getIntOrDefault(String name, int defaultValue) {
        return Integer.valueOf((String)this.eventArguments.getOrDefault(name, String.valueOf(defaultValue)));
    }

    public Float getFloat(String name) {
        String value = (String)this.eventArguments.get(name);
        return Objects.isNull(value)?null:Float.valueOf(value);
    }

    public Float getFloatOrDefault(String name, float defaultValue) {
        return Float.valueOf((String)this.eventArguments.getOrDefault(name, String.valueOf(defaultValue)));
    }

    public Double getDouble(String name) {
        String value = (String)this.eventArguments.get(name);
        return Objects.isNull(value)?null:Double.valueOf(value);
    }

    public Double getDoubleOrDefault(String name, double defaultValue) {
        return Double.valueOf((String)this.eventArguments.getOrDefault(name, String.valueOf(defaultValue)));
    }

    public Boolean getBoolean(String name) {
        String value = (String)this.eventArguments.get(name);
        return Objects.isNull(value)?null:Boolean.valueOf(value);
    }

    public Boolean getBooleanOrDefault(String name, boolean defaultValue) {
        return Boolean.valueOf((String)this.eventArguments.getOrDefault(name, String.valueOf(defaultValue)));
    }

    public String getString(String name) {
        return (String)this.eventArguments.get(name);
    }

    public String getStringOrDefault(String name, String defaultValue) {
        return (String)this.eventArguments.getOrDefault(name, defaultValue);
    }

    public String toString() {
        return "Event{destinationService='" + this.destinationService + '\'' + ", eventName='" + this.eventName + '\'' + ", eventArguments=" + this.eventArguments + '}';
    }
}
