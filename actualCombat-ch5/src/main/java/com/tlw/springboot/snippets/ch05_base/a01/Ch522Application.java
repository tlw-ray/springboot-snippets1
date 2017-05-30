package com.tlw.springboot.snippets.ch05_base.a01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 唐力伟 on 2017/4/18 20:54.
 */
@RestController
@SpringBootApplication
public class Ch522Application {

    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot";
    }

    public static void main(String[] args){
        SpringApplication.run(Ch522Application.class, args);
    }
}
