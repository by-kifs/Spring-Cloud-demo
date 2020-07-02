package com.lasi.demo.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cys on 2017/11/17.
 */

@FeignClient(name = "demo")
public interface FeignService {

    @RequestMapping(value = "api/demo/eurekatest",method = RequestMethod.GET)
    String getDemo();
}
