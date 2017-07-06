package com.mysql;

import com.mysql.model.Role;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zfl on 2017/7/6.
 */
public class RoleFormAction extends ActionSupport {
    private int rid;
    private String rnm;

    private Role role = new Role();//必须立即实例化


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



    @Override
    public String execute() throws Exception {
        System.out.println(role.getRid());
        System.out.println(role.getRnm());
        return super.execute();
    }
}
