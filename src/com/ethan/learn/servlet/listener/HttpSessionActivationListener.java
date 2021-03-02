package com.ethan.learn.servlet.listener;

import javax.servlet.http.HttpSessionEvent;

/**
 * @author ethan
 * @date 2021/2/10 5:58 下午
 */
public class HttpSessionActivationListener implements javax.servlet.http.HttpSessionActivationListener {
    public HttpSessionActivationListener() {
        System.out.println("HttpSessionActivationListener ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("HttpSessionActivationListener sessionWillPassivate ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("HttpSessionActivationListener sessionDidActivate ...");
        System.out.println("-------------------------------");
    }
}
