package com.lasi.demo.event.fegin;

import com.lasi.demo.event.Event;
import org.springframework.stereotype.Component;

/**
 * Created by cys on 2018/3/2.
 */
@Component
public class FeignClientFallback implements EventClient {
    public FeignClientFallback() {
    }

    public boolean publishEvent(Event event) {
        throw new RuntimeException("事件触发失败:" + event);
    }

    public boolean publishPublicEvent(Event event) {
        throw new RuntimeException("事件触发失败:" + event);
    }
}
