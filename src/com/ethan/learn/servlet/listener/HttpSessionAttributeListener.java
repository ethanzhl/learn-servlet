package com.ethan.learn.servlet.listener;

import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author ethan
 * @date 2021/2/10 5:56 下午
 */
public class HttpSessionAttributeListener implements javax.servlet.http.HttpSessionAttributeListener {
    public HttpSessionAttributeListener() {
        System.out.println("HttpSessionAttributeListener ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("HttpSessionAttributeListener attributeAdded ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("HttpSessionAttributeListener attributeRemoved ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("HttpSessionAttributeListener attributeReplaced ...");
        System.out.println("-------------------------------");
    }
}
