package com.slipp.slippdeployinit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jarvis on 2017. 8. 30..
 */
@Controller
public class IndexController {

    @Value("${msg}")
    private String msg;

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "hello world?! master :"+msg;
    }

    @GetMapping("/index")
    public String indexPage(){
        return "index";
    }
}
