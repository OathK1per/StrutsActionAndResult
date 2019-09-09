package com.zyp.struts2.webResources;

import org.apache.struts2.interceptor.*;

import java.util.Map;

/**
 * created by Yuanping Zhang on 09/09/2019
 */
public class AwareActionWoServlet implements ApplicationAware, SessionAware, RequestAware {
    private Map<String, Object> applicationMap;
    private Map<String, Object> sessionMap;
    private Map<String, Object> requestMap;

    @Override
    public void setApplication(Map<String, Object> map) {
        applicationMap = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        sessionMap = map;
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        requestMap = map;
    }

    public String execute() {
        applicationMap.put("applicationKey", "applicationValue");
        sessionMap.put("sessionKey", "sessionValue");
        requestMap.put("requestKey", "requestValue");

        return "success";
    }
}
