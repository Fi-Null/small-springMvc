package com.small.springMvc.webappProject.controller;

import com.small.spring.beans.annotation.Component;
import com.small.springMvc.framework.handlerMapping.HandlerInterceptor;
import com.small.springMvc.framework.modelAndView.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class LoggerHandlerInterceptor implements HandlerInterceptor {
    @Override
    public String[] getPath() {
        return new String[]{"/mvc/person/"};
    }

    @Override
    public boolean preHandle(HttpServletRequest var1, HttpServletResponse var2, Object var3) throws Exception {
        System.out.println("logger的preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("logger的postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("logger的afterCompletion");
    }

}
