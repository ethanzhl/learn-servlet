package com.ethan.learn.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ethan
 * @date 2021/2/8 9:42 下午
 */
public class MyServlet2 implements Servlet {
    public MyServlet2() {
        System.out.println("MyServlet2");
        System.out.println("-------------------------------");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("MyServlet2 init ...");
        System.out.println("-------------------------------");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("MyServlet2 service ...");
        System.out.println("-------------------------------");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("MyServlet2 destroy ...");
        System.out.println("-------------------------------");
    }
}
