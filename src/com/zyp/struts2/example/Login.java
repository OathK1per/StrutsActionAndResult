package com.zyp.struts2.example;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.dispatcher.SessionMap;

import java.util.Map;

/**
 * created by Yuanping Zhang on 09/09/2019
 */
public class Login {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String login() {

        ActionContext actionContext = ActionContext.getContext();

        // keep username in session
        Map<String, Object> session = actionContext.getSession();
        // when refresh web, count won't increase
        if (!session.containsValue(username)) {
            session.put("username", username);

            // count number
            Map<String, Object> application = actionContext.getApplication();
            int count = (int) application.getOrDefault("count", 0);
            application.put("count", ++count);
        }
        return "success";
    }

    public String logout() {

        ActionContext actionContext = ActionContext.getContext();

        Map<String, Object> session = actionContext.getSession();
        if (session instanceof SessionMap) {
            SessionMap sessionMap = (SessionMap)session;
            sessionMap.invalidate();
        }

        // count number
        Map<String, Object> application = actionContext.getApplication();
        int count = (int) application.getOrDefault("count", 0);
        if (count > 0) {
            application.put("count", --count);
        }
        return "success";
    }
}
