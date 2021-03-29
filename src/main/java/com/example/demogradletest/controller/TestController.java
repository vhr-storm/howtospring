package com.example.demogradletest.controller;

import com.example.demogradletest.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class TestController {
    @Autowired
            private MyModel model;
    @RequestMapping (value = "/sayHello", method = RequestMethod.GET)
            public String sayHello(){
            model.setName("hello world");
            return model.toString();
        }
}
