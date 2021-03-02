package com.ethan.learn.servlet.listener;

import javax.servlet.ServletRequestEvent;

/**
 * @author ethan
 * @date 2021/2/10 5:55 下午
 */
public class ServletRequestListener implements javax.servlet.ServletRequestListener {
    public ServletRequestListener() {
        System.out.println("ServletRequestListener");
        System.out.println("-------------------------------");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("ServletRequestListener requestInitialized ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("ServletRequestListener requestDestroyed ...");
        System.out.println("-------------------------------");
    }
}
