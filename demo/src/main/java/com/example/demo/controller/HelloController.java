package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * Created by cys on 2017/8/22.
 */
@RestController
public class HelloController {



    @Value("${wos.ids-server}")
    String idsserver;

    @ApiOperation(value = "hello", httpMethod = "GET", response = ResponseEntity.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "Authorization token",
                    required = true, dataType = "string", paramType = "header")
    })
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public ResponseEntity hello(){
        Map<String,String> args = new HashMap<>();
        args.put("code","hello world");
        return new ResponseEntity(args,HttpStatus.OK);
    }

    @RequestMapping(value = "/eurekatest" , method = RequestMethod.GET)
    public String index() {
        return idsserver;
    }

}
