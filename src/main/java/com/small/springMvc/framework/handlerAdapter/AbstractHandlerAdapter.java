package com.small.springMvc.framework.handlerAdapter;


import com.small.spring.beans.context.ApplicationContext;

public abstract class AbstractHandlerAdapter implements HandlerAdapter {
    protected ApplicationContext mvcContext;

    public AbstractHandlerAdapter(ApplicationContext mvcContext) {
        this.mvcContext = mvcContext;
    }
}
