package com.tlw.springboot.snippets.ch07_web.a08_websocket_p2p;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by 唐力伟 on 2017/5/13 5:30.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/ws").setViewName("/ws");
        registry.addViewController("/login").setViewName("/login");
        registry.addViewController("/chat").setViewName("/chat");
    }
}
