package com.example.demo.event.fegin;

import com.example.demo.event.Event;
import org.springframework.stereotype.Component;

/**
 * Created by cys on 2018/3/2.
 */
@Component
public class FeignClientFallback implements EventClient {
    public FeignClientFallback() {
    }

    public boolean publishEvent(Event event) {
        return false;
    }
}
