package com.xucy.life.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xucy
 * @Date 2019-09-03 17:07
 * @Description
 **/

@RestController
@RequestMapping("/testCon")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "成功1122";
    }
}
