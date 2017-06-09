package com.tlw.springboot.snippets.ch07_web.a05_servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * Created by 唐力伟 on 2017/4/25 20:44.
 * 注册Servlet和Listener失败
 */
@SpringBootApplication
@Controller
public class ServletMain {
    @Bean
    public XxServlet xxServlet(){
        return new XxServlet();
    }

    @Bean
    public YyFilter yyFilter(){
        return new YyFilter();
    }

    @Bean
    public ZzListener zzListener(){
        return new ZzListener();
    }

    public static void main(String[] args){
        SpringApplication.run(ServletMain.class, args);
    }
}
