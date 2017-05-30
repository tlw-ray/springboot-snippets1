package com.tlw.springboot.snippets.ch05_base.a02Unweb;

import org.springframework.stereotype.Service;

/**
 * Created by 唐力伟 on 2017/5/6 7:02.
 * 简单的输出一句话
 */
@Service
class HelloService {
    void hello(){
        System.out.println("Hello...");
    }
}
