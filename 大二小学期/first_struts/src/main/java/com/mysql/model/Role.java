package com.mysql.model;

/**
 * Created by zfl on 2017/7/6.
 */
public class Role {
    private int rid;
    private String rnm;

    public Role() {
    }
    public Role(int rid, String rnm) {
        this.rid = rid;
        this.rnm = rnm;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRnm() {
        return rnm;
    }

    public void setRnm(String rnm) {
        this.rnm = rnm;
    }
}
