package com.example.demo.controller;

import com.example.demo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cys on 2017/11/17.
 */

@RestController
@RefreshScope
@RequestMapping(value = "/bus-test")
public class BusTestController {

    @Autowired
    FeignService feignService;

    @Value("${bus}")
    String bus;

    @RequestMapping(value = "/bus" ,method = RequestMethod.GET)
    public ResponseEntity hello() {
        Map<String, String> args = new HashMap<>();
        String test = feignService.getDemo();
        args.put("code", test);
        return new ResponseEntity(args, HttpStatus.OK);
    }

    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public ResponseEntity busTest() {
        Map<String, String> args = new HashMap<>();
        args.put("code", bus);
        return new ResponseEntity(args, HttpStatus.OK);
    }
}
