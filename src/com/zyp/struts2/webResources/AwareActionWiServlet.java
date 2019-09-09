package com.zyp.struts2.webResources;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * created by Yuanping Zhang on 09/09/2019
 */
public class AwareActionWiServlet implements ServletRequestAware, ServletResponseAware, ServletContextAware {

    public String execute() {

        return "success";
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        System.out.println(httpServletRequest);
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        System.out.println(httpServletResponse);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        System.out.println(servletContext);
    }
}
