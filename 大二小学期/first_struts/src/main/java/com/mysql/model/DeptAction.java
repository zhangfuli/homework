package com.mysql.model;

import com.mysql.dao.ListDao;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.junit.Test;

import javax.servlet.http.HttpServlet;
import java.util.List;
import java.util.Map;

/**
 * Created by zfl on 2017/7/6.
 */
public class DeptAction  extends ActionSupport{

    private String rnm;
    private int rid;
    private List<Dept> deps;

    private Role role = new Role();

    public int getRid() {return rid;}
    public void setRid(int rid) {this.rid = rid;}
    public String getRnm() {return rnm;}
    public void setRnm(String rnm) {this.rnm = rnm;}


    public List<Dept> getDeps() {
        return deps;
    }

    public void setDeps(List<Dept> deps) {
        this.deps = deps;
    }



    //向页面传值
    public String list(){
        deps = ListDao.lrs();
        ServletActionContext.getRequest().setAttribute("deps",deps);
        return SUCCESS;
    }

    public String add(){
        ListDao listDao = new ListDao();
        System.out.println(rnm);
        int i = listDao.add(rnm);
        if(i == 0){
            return ERROR;
        }else{
            return SUCCESS;
        }
    }


    @Test()
    public void Test(){
        deps = ListDao.lrs();
        for(int i = 0; i < deps.size();i++){
            System.out.println(deps.get(i).getDepname());
        }
    }


    @Override
    public String execute() throws Exception {

        return super.execute();
    }


}
