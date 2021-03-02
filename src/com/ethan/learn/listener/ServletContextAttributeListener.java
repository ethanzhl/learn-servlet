package com.ethan.learn.listener;

import javax.servlet.ServletContextAttributeEvent;

/**
 * @author ethan
 * @date 2021/2/10 5:55 下午
 */
public class ServletContextAttributeListener implements javax.servlet.ServletContextAttributeListener {
    public ServletContextAttributeListener() {
        System.out.println("ServletContextAttributeListener");
        System.out.println("-------------------------------");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("ServletContextAttributeListener attributeAdded ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("ServletContextAttributeListener attributeRemoved ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("ServletContextAttributeListener attributeReplaced ...");
        System.out.println("-------------------------------");
    }
}
