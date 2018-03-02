package com.example.demo.event.fegin;

import com.example.demo.event.Event;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cys on 2018/3/2.
 */
@FeignClient(
        name = "config-server",
        fallback = FeignClientFallback.class
)
public interface EventClient {
    @RequestMapping(
            path = {"/api/global/sec/event"},
            method = {RequestMethod.POST}
    )
    boolean publishEvent(@RequestBody Event var1);
}
