package com.tlw.springboot.snippets.ch07_web.a03_viewResolver;

import com.tlw.springboot.snippets.ch07_web.a01_thymeleaf.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.BeanNameViewResolver;

/**
 * Created by 唐力伟 on 2017/4/25 20:32.
 */
@SpringBootApplication
@RestController
public class ViewResolverMain {
    @Bean
    public BeanNameViewResolver beanNameViewResolver(){
        BeanNameViewResolver resolver = new BeanNameViewResolver();
        return resolver;
    }
    @RequestMapping(value = "/json", produces={MediaType.APPLICATION_JSON_VALUE})
    public Person json(){
        Person single = new Person("aa", 11);
        return single;
    }
    public static void main(String[] args){
        SpringApplication.run(ViewResolverMain.class, args);
    }
}
