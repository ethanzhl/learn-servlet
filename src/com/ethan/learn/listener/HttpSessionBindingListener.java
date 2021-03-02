package com.ethan.learn.listener;

import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author ethan
 * @date 2021/2/10 5:57 下午
 */
public class HttpSessionBindingListener implements javax.servlet.http.HttpSessionBindingListener {
    public HttpSessionBindingListener() {
        System.out.println("HttpSessionBindingListener ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("HttpSessionBindingListener valueBound ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("HttpSessionBindingListener valueUnbound ...");
        System.out.println("-------------------------------");
    }
}
