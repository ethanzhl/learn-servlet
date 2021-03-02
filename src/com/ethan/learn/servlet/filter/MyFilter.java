package com.ethan.learn.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ethan
 * @date 2021/2/10 5:59 下午
 */
public class MyFilter implements Filter {

    public MyFilter() {
        System.out.println("MyFilter");
        System.out.println("-------------------------------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter doFilter ...");
        System.out.println("-------------------------------");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter init ...");
        System.out.println("-------------------------------");
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter destroy ...");
        System.out.println("-------------------------------");
    }
}
