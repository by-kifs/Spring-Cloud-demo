package com.example.demo.Controller;

import com.example.demo.service.IHzsUserTestService;
import com.example.demo.vo.HzsUBUser;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * Created by cys on 2017/8/22.
 */
@RestController
public class HelloController {


    @Autowired
    private DiscoveryClient client;

    @Autowired
    private IHzsUserTestService userTestService;

    @Value("${comfig.test.value}")
    private String value;

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
        return value;
    }

    @ApiOperation(value = "hello", httpMethod = "GET", response = ResponseEntity.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "Authorization token",
                    required = true, dataType = "string", paramType = "header")
    })
    @RequestMapping(value = "/mybatis" ,method = RequestMethod.GET)
    public ResponseEntity mybatis(@RequestParam("userId") Integer userId) {
        HzsUBUser user = userTestService.getUser(userId);
        return new ResponseEntity(user, HttpStatus.OK);
    }

}
