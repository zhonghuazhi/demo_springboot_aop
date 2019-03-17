package net.cc.demo_springboot_aop.web.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @classname HelloController
 * @author: zhonghua.zhi
 * @date: 2019-03-18 00:06
 * @version: 1.0
 * @description: TODO
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam String name) {
        return "Hi " + name;
    }
}