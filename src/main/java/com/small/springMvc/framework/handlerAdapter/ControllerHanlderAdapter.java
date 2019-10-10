package com.small.springMvc.framework.handlerAdapter;

import com.small.spring.beans.context.ApplicationContext;
import com.small.springMvc.framework.handlerMapping.Controller;
import com.small.springMvc.framework.modelAndView.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerHanlderAdapter extends AbstractHandlerAdapter {
    public ControllerHanlderAdapter(ApplicationContext mvcContext) {
        super(mvcContext);
    }

    @Override
    public boolean supports(Object handler) {
        if (handler instanceof Controller)
            return true;
        return false;
    }

    @Override
    public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return null;
    }
}
