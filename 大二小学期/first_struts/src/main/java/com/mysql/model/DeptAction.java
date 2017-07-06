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
    private List<Dept> deps;

    public List<Dept> getDeps() {
        return deps;
    }

    public void setDeps(List<Dept> deps) {
        this.deps = deps;
    }

    public String list(){
        deps = ListDao.lrs();
        for(int i = 0; i < deps.size();i++){
            deps.get(i);
        }
        ServletActionContext.getRequest().setAttribute("deps",deps);
        return SUCCESS;
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
