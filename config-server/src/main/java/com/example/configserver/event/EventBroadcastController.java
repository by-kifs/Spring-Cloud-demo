package com.example.configserver.event;
/**
 * Created by neng.liu@hand-china.com on 2017/6/7.
 */

//import com.hand.zhishinet.common.event.Event;
//import com.hand.zhishinet.common.event.EventFactory;
//import com.hand.zhishinet.common.utils.RequestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author neng.liu@hand-china.com	2017/6/7 09:45
 * @description
 */
@RestController
@RequestMapping("/api/global")
public class EventBroadcastController {
//    @Autowired
//    private EventFactory eventFactory;
//
//    @PostMapping("/sec/event")
//    public ResponseEntity publishEvent(@RequestBody Event event) {
//        EventFactory.EventBuilder eventBuilder= eventFactory.eventTo(event.getDestinationService()).name(event.getEventName());
//        if (Objects.nonNull(event.getEventArguments())) {
//            event.getEventArguments().forEach((key, value) -> {
//                eventBuilder.arg(key, value);
//            });
//        }
//        eventBuilder.arg("userId", Objects.toString(RequestUtils.getUserId(),"0"));
//        eventBuilder.send();
//        return ResponseEntity.ok(true);
//    }
//
//    @PostMapping("/public/event")
//    public ResponseEntity publishPublicEvent(@RequestBody Event event) {
//        EventFactory.EventBuilder eventBuilder= eventFactory.eventTo(event.getDestinationService()).name(event.getEventName());
//        if (Objects.nonNull(event.getEventArguments())) {
//            event.getEventArguments().forEach((key, value) -> {
//                eventBuilder.arg(key, value);
//            });
//        }
//        eventBuilder.send();
//        return ResponseEntity.ok(true);
//    }
}
