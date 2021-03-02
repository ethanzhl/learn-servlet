package com.ethan.learn.listener;

import javax.servlet.ServletRequestAttributeEvent;

/**
 * @author ethan
 * @date 2021/2/10 5:57 下午
 */
public class ServletRequestAttributeListener implements javax.servlet.ServletRequestAttributeListener {
    public ServletRequestAttributeListener() {
        System.out.println("ServletRequestAttributeListener constructor ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("ServletRequestAttributeListener attributeAdded ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("ServletRequestAttributeListener attributeRemoved ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("ServletRequestAttributeListener attributeReplaced ...");
        System.out.println("-------------------------------");
    }
}
