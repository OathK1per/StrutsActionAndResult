package com.zyp.struts2.result;

/**
 * created by Yuanping Zhang on 09/09/2019
 */
public class RedirectResult {

    public String execute() {
        System.out.println("execute it when redirect");
        return "success";
    }
}
