package com.tlw.springboot.snippets.ch06_adv.a02_safe_properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 唐力伟 on 2017/4/18 21:37.
 * 通过ConfigurationProperties将属性和一个Bean关联起来，实现类型安全的配置
 * 通过location来设定对象绑定的配置文件位置
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSettings {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
