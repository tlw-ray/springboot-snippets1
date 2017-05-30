package com.tlw.springboot.snippets.ch07_web.a07_websocket_radio;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by 唐力伟 on 2017/4/26 22:08.
 */
@Controller
public class TLWController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public TLWResponse say(TLWMessage message) throws Exception{
        Thread.sleep(1000);
        return new TLWResponse("Welcome, " + message.getName() + "!");
    }
}
