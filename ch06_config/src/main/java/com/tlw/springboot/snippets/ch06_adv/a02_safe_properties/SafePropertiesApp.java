package com.tlw.springboot.snippets.ch06_adv.a02_safe_properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 唐力伟 on 2017/4/18 21:36.
 */
@RestController
@SpringBootApplication
public class SafePropertiesApp {
    @Autowired
    private AuthorSettings authorSettings;
    @RequestMapping("/")
    public String index(){
        return "author name is " + authorSettings.getName()  + " and author age is " + authorSettings.getAge();
    }
    public static void main(String[] args){
        SpringApplication.run(SafePropertiesApp.class, args);
    }
}
