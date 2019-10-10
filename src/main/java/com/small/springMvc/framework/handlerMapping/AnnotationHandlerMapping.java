package com.small.springMvc.framework.handlerMapping;

import com.small.spring.beans.BeanDefinition;
import com.small.spring.beans.context.ApplicationContext;
import com.small.spring.beans.factory.AbstractBeanFactory;
import com.small.springMvc.framework.annocation.RequestMapping;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;

public class AnnotationHandlerMapping extends AbstractHandlerMapping {
    public AnnotationHandlerMapping(ApplicationContext mvcContext) {
        super(mvcContext);
    }

    protected void registryURLAndHandler() {
        AbstractBeanFactory beanFactory = mvcContext.getBeanFactory();
        Map<String, BeanDefinition> map = beanFactory.getBeanDefinitionMap();
        for (Map.Entry<String, BeanDefinition> entry : map.entrySet()) {
            String prefix = null;
            String suffix = null;
            Class clazz = entry.getValue().getBeanClass();//通过类名获得前缀
            Object bean = entry.getValue().getBean();
            Annotation annotation = clazz.getAnnotation(RequestMapping.class);
            if (annotation != null) {
                prefix = ((RequestMapping) annotation).value();
            } else {
                continue;
            }
            Method[] methods = clazz.getMethods();//通过方法获得后缀
            for (Method method : methods) {
                annotation = method.getAnnotation(RequestMapping.class);
                if (annotation != null) {
                    suffix = ((RequestMapping) annotation).value();
                    String url = prefix + suffix;
                    handlerRegistry.put(url, new RequestMappingHandler(bean, method, null));
                    //System.out.println("url = "+url);
                } else {
                    continue;
                }
            }
        }
    }


}
