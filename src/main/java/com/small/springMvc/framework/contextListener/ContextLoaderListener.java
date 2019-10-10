package com.small.springMvc.framework.contextListener;


import com.small.spring.beans.context.ApplicationContext;
import com.small.spring.beans.context.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String springXmlPath = servletContext.getInitParameter("contextConfigLocation");
        if (springXmlPath.startsWith("classpath:")) {
            springXmlPath = springXmlPath.substring(10);
        }
        ApplicationContext applicationContext = null;
        try {
            applicationContext = new ClassPathXmlApplicationContext(springXmlPath);
            servletContext.setAttribute("springContext", applicationContext);
//            PersonService personService = (PersonService) applicationContext.getBean("personService");
//            System.out.println(personService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
