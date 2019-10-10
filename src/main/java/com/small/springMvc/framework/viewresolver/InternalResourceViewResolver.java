package com.small.springMvc.framework.viewresolver;

import com.small.springMvc.framework.view.InternalResourceView;
import com.small.springMvc.framework.view.View;

public class InternalResourceViewResolver implements ViewResolver {
    private String viewClass;
    private String prefix;
    private String suffix;

    public String getViewClass() {
        return viewClass;
    }

    public void setViewClass(String viewClass) {
        this.viewClass = viewClass;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public View resolveViewName(String viewName) throws Exception {
        if (viewClass.equals("InternalResourceView")) {
            if (viewName.startsWith("redirect:"))
                return new InternalResourceView(viewName.substring(9), true);
            else
                return new InternalResourceView(prefix + viewName + suffix, false);
        }
        return null;
    }
}
