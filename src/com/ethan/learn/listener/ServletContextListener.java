package com.ethan.learn.listener;

import javax.servlet.ServletContextEvent;

/**
 * @author ethan
 * @date 2021/2/10 5:53 下午
 */
public class ServletContextListener implements javax.servlet.ServletContextListener {
    public ServletContextListener() {
        System.out.println("ServletContextListener");
        System.out.println("-------------------------------");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContextListener contextInitialized ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContextListener contextDestroyed ...");
        System.out.println("-------------------------------");
    }
}
