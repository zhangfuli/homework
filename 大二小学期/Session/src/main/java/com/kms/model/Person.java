package com.kms.model;

/**
 * Created by zfl on 2017/7/3.
 */
public class Person {

    private int pid;
    private String pnm;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

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

    private String pwd;

    public Person() {
    }
    public Person(String pnm, String pwd) {
        this.pnm = pnm;
        this.pwd = pwd;
    }


}
