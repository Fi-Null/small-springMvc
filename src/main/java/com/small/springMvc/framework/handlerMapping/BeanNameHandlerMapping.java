package com.small.springMvc.framework.handlerMapping;

import com.small.spring.beans.context.ApplicationContext;

//这个类用于bean的id与相应uri的匹配，比如/mvc/person 就匹配Person这个类
public class BeanNameHandlerMapping extends AbstractHandlerMapping {
    public BeanNameHandlerMapping(ApplicationContext mvcContext) {
        super(mvcContext);
    }

    @Override
    protected void registryURLAndHandler() {

    }
}
