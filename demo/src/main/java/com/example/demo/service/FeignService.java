package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @author yusong.chen@hand-china.com  2018/4/13
 * @description
 */
@FeignClient("bus-test")
public interface FeignService {

    @RequestMapping(value = "api/bus-test/test",method = RequestMethod.GET)
    Map<String, String> getDemo();
}
