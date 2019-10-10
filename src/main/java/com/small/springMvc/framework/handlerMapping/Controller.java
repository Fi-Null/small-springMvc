package com.small.springMvc.framework.handlerMapping;

import com.small.springMvc.framework.modelAndView.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//所有Controller的实现类均会被ControllerHandlerMapping注册
public interface Controller {
    ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
