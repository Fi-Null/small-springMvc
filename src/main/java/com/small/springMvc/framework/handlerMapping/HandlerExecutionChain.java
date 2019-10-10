package com.small.springMvc.framework.handlerMapping;

import java.util.List;

public class HandlerExecutionChain {
    private Object handler;
    private List<HandlerInterceptor> interceptors;

    public Object getHandler() {
        return handler;
    }

    public void setHandler(Object handler) {
        this.handler = handler;
    }

    public List<HandlerInterceptor> getInterceptors() {
        return interceptors;
    }

    public void setInterceptors(List<HandlerInterceptor> interceptors) {
        this.interceptors = interceptors;
    }
}
