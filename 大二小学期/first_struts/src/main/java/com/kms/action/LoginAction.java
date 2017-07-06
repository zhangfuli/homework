package com.kms.action;

/**
 * Created by zfl on 2017/7/5.
 */
public class LoginAction {

    /*
    *
    * action 必须与form表单的name一样
    *
    *
    * */
    private String pnm;
    private String pwd;

    public String getPnm() {
        return pnm;
    }

    public void setPnm(String pnm) {
        this.pnm = pnm;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String login(){
        System.out.println(pnm);
        System.out.println(pwd);
        return "success";
    }
}
