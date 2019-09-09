package com.zyp.struts2.result;

/**
 * created by Yuanping Zhang on 09/09/2019
 */
public class ResultType {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public String execute(){

        String result = null;

        //根据请求参数 number 的值, 返回对应的页面
        //1. 若 number 是 3 个整数, 返回 success
        if(number % 4 == 0) {
            System.out.println("%4=0");
            result = "success";

            //2. 若 number 除以 3 余 1, 返回 login
        }else if(number % 4 == 1) {
            System.out.println("%4=1");
            result = "login";

            //3. 若 number 除以 3 余 2, 返回 index
        }else if(number % 4 == 2) {
            System.out.println("%4=2");
            result = "index";

        }else {
            System.out.println("%4=3");
            return "test";
        }
        return result;
    }
}
