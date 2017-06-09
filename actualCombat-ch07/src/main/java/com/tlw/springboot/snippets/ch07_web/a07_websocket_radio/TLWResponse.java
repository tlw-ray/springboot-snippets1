package com.tlw.springboot.snippets.ch07_web.a07_websocket_radio;

/**
 * Created by 唐力伟 on 2017/4/26 22:08.
 */
public class TLWResponse {
    private String responseMessage;

    public TLWResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
