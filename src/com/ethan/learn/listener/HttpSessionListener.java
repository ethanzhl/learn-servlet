package com.ethan.learn.listener;

import javax.servlet.http.HttpSessionEvent;

/**
 * @author ethan
 * @date 2021/2/10 5:54 下午
 */
public class HttpSessionListener implements javax.servlet.http.HttpSessionListener {
    public HttpSessionListener() {
        System.out.println("HttpSessionListener");
        System.out.println("-------------------------------");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("HttpSessionListener sessionCreated ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("HttpSessionListener sessionDestroyed ...");
        System.out.println("-------------------------------");
    }
}
