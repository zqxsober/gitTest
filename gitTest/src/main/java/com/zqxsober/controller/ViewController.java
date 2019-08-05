package com.zqxsober.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sober")
public class ViewController {

    @RequestMapping(value = "/view")
    @ResponseBody
    public String viewTest(){
        return "ViewTest";
    }

}
