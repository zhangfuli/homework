package com.mysql;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by zfl on 2017/7/6.
 */
public class RoleDmiAction extends ActionSupport {

    public  String add(){
        System.out.println("add is used");
        return SUCCESS;
    }
    public String update(){
        System.out.println("update is used");
        return SUCCESS;
    }
    public  String delete(){
        System.out.println("delete is used");
        return SUCCESS;
    }
    public String list(){
        System.out.println("list is used");
        return SUCCESS;
    }

    @Override
    public String execute() throws Exception {
        return super.execute();
    }
}
