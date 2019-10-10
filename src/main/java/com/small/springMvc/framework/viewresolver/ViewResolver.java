package com.small.springMvc.framework.viewresolver;

import com.small.springMvc.framework.view.View;

public interface ViewResolver {
    View resolveViewName(String viewName) throws Exception;
}
