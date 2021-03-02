package com.ethan.learn.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ethan
 * @date 2021/2/10 5:59 下午
 */
public class MyFilter2 implements Filter {
    public MyFilter2() {
        System.out.println("MyFilter2 constructor ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter2 doFilter ...");
        System.out.println("-------------------------------");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter2 init ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter2 destroy ...");
        System.out.println("-------------------------------");
    }
}
