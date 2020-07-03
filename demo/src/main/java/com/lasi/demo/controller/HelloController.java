package com.lasi.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cys on 2017/8/22.
 */
@RestController
@RequestMapping(value = "/api/demo")
public class HelloController {



    @Value("${wos.ids-server}")
    String idsserver;

    @RequestMapping(value = "/eurekatest" , method = RequestMethod.GET)
    public String index() {
        return idsserver;
    }

}
