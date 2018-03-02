package com.example.demo.event;

import com.example.demo.vo.NotificationEvent;
import org.springframework.context.event.EventListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by cys on 2018/3/2.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@EventListener({NotificationEvent.class})
public @interface Topic {
    String name();
}