package com.zyp.struts2.webResources;

import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * created by Yuanping Zhang on 09/09/2019
 */
public class ActionContextWiServlet {

    public String execute() {

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = ServletActionContext.getRequest().getSession();
        ServletContext context = ServletActionContext.getServletContext();

        System.out.println(request);
        System.out.println(session);
        System.out.println(context);

        return "success";
    }
}
