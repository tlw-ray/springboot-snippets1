package com.tlw.springboot.snippets.ch0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 唐力伟 on 2017/5/16 22:34.
 */
@SpringBootApplication
@RestController
public class HelloApp {
    public static void main(String[] args){
        SpringApplication.run(HelloApp.class, args);
    }
    @RequestMapping("/hello")
    String hello(){
        return "Hello!!!";
    }
}
