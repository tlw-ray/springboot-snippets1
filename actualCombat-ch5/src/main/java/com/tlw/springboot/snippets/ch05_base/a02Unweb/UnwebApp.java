package com.tlw.springboot.snippets.ch05_base.a02Unweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by 唐力伟 on 2017/5/6 7:00.
 * 直接调用SpringBoot容器中的功能
 */
@SpringBootApplication
public class UnwebApp {

    public static void main(String[] args){
        SpringApplication app = new SpringApplication(UnwebApp.class);
        app.setWebEnvironment(false);
        ApplicationContext context = app.run(args);
        HelloService service = context.getBean(HelloService.class);
        service.hello();

    }
}
