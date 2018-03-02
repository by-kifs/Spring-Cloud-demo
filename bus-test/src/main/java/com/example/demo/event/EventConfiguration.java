package com.example.demo.event;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by cys on 2018/3/2.
 */
@Configuration
@ComponentScan(
        basePackageClasses = {EventConfiguration.class}
)
@EnableFeignClients(
//        defaultConfiguration = {FeignResponseEntityConfiguration.class},
        basePackages = {"com.example.demo.event"}
)
@EnableAspectJAutoProxy(
        exposeProxy = true
)
public class EventConfiguration {
    public EventConfiguration() {
    }

    @Bean
    EventAspect eventAspect() {
        return new EventAspect();
    }
}
