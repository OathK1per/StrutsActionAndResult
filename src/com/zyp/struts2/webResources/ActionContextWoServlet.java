package com.zyp.struts2.webResources;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.dispatcher.SessionMap;

import java.util.Map;

/**
 * created by Yuanping Zhang on 09/09/2019
 */
public class ActionContextWoServlet {

    public String execute() {

        //ActionContext是Action类的上下文对象，可以从中获取Action类的全部信息
        ActionContext actionContext = ActionContext.getContext();

        //application对应的map，可以向其中添加属性
        Map<String, Object> application = actionContext.getApplication();
        application.put("applicationKey", "applicationValue");

        Object applicationValue = application.get("applicationKey");
        System.out.println("Value: " + applicationValue);

        //session对应的map
        Map<String, Object> session = actionContext.getSession();
        session.put("sessionKey", "sessionValue");
        Object sessionValue = session.get("sessionKey");
        System.out.println("Value: " + sessionValue);

        System.out.println(session.getClass());

        if(session instanceof SessionMap){
            SessionMap sm = (SessionMap) session;
            sm.invalidate();
            System.out.println("session 失效了. ");
        }

        //获取request的过程与上面略有不同
        Map<String, Object> request = (Map<String, Object>) actionContext.get("request");
        request.put("requestKey", "requestValue");
        System.out.println("Value: " + request.get("requestKey"));

        Map<String, Object> parameter = (Map<String, Object>) actionContext.get("parameter");
        request.put("parameterKey", "parameterValue");
        System.out.println("Value: " + request.get("parameterKey"));

        return "success";
    }
}
