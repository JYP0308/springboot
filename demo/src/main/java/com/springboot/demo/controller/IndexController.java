package com.springboot.demo.controller;

import com.springboot.demo.entity.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private TestConfigBean testConfigBean;

    @RequestMapping("/")
    String index(){
//        return configBean.getName()+"--"+configBean.getTitle();
        return testConfigBean.getName()+":"+testConfigBean.getAge();
    }

}
