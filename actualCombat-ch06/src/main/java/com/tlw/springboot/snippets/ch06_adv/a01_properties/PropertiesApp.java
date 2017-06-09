package com.tlw.springboot.snippets.ch06_adv.a01_properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 唐力伟 on 2017/4/18 21:33.
 */
@RestController
@SpringBootApplication
public class PropertiesApp {
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;
    @RequestMapping("/")
    private String index(){
        return "book name: " + bookName + " boot author is: " + bookAuthor;
    }
    public static void main(String[] args){
        SpringApplication.run(PropertiesApp.class, args);
    }
}
