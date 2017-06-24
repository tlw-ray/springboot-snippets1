package com.tlw.springboot.snippets.ch07_web.a02_thymeleaf;

import com.tlw.springboot.snippets.ch07_web.a01_thymeleaf.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 唐力伟 on 2017/4/21 21:43.
 */
@Controller
@SpringBootApplication
public class ThymeleafMain {
    @RequestMapping("/")
    public String index(Model model){
        Person single = new Person("aa", 11);
        List<Person> people = new ArrayList();
        Person p1 = new Person("xx", 11);
        Person p2 = new Person("yy", 22);
        Person p3 = new Person("zz", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index1";
    }

    public static void main(String[] args){
        SpringApplication.run(ThymeleafMain.class, args);
    }

}
