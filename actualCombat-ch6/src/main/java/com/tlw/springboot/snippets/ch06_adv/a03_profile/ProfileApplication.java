package com.tlw.springboot.snippets.ch06_adv.a03_profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 唐力伟 on 2017/4/19 20:23.
 * 在配置文件中指定profile来改变端口
 */
@SpringBootApplication
@RestController
public class ProfileApplication {
    public static void main(String[] args){
        SpringApplication.run(ProfileApplication.class, args);
    }
    @RequestMapping
    public String index(){
        return "Hello";
    }
}
