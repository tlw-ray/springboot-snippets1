package com.tlw.springboot.snippets.ch07_web.a05_servlet;

import org.apache.catalina.servlet4preview.http.HttpFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by 唐力伟 on 2017/4/25 20:45.
 */
public class YyFilter extends HttpFilter{
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.getWriter().println("<h2>YyFilter</h2>");
    }

    @Override
    public void destroy() {
        System.out.println("YyFilter destroy...");
    }
}
