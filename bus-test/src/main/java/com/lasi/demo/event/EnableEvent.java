package com.lasi.demo.event;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by cys on 2018/3/2.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@ImportAutoConfiguration({EventConfiguration.class})
public @interface EnableEvent {
}