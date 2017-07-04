package com.kms.model;

/**
 * Created by zfl on 2017/7/3.
 */
public class Role {
    private int  depno;
    private String depname;
    private String loc;


    public int getDepno() {
        return depno;
    }

    public void setDepno(int depno) {
        this.depno = depno;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }


    public Role() {

    }
    public Role(int depno, String depname, String loc) {
        this.depno = depno;
        this.depname = depname;
        this.loc = loc;
    }
}
