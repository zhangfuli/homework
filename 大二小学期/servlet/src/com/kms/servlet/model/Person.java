package com.kms.servlet.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

/**
 * Created by zfl on 2017/7/1.
 *  * JavaBean标准
 * 1.父类是Object
 * 2.具有默认无参的构造函数
 * 3.所有的属性都是私有的
 * 4.所有的属性都有提供get set方法
 * 5.所有属性的首字母都小写
 * 6.不建议再提供其他方法
 * 7.boolean agreee类型  isAgree(); setAgree()
 * 8.建议实现Serializable接口
 */
public class Person{

    private  int id;
    private String name;
    private String pwd;
    private String sex;
    private String enjoy;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public Person(String name,String pwd,String sex,String enjoy){

        this.name = name;
        this.pwd = pwd;
        this.sex = sex;
        this.enjoy = enjoy;
        this.date = new Date().toString();

    }
    public Person(String id,String name,String pwd,String sex,String enjoy){

        if(id.length()>0){
            this.id = Integer.parseInt(id);
        }

        this.name = name;
        this.pwd = pwd;
        this.sex = sex;
        this.enjoy = enjoy;
        this.date = new Date().toString();

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEnjoy() {
        return enjoy;
    }

    public void setEnjoy(String enjoy) {
        this.enjoy = enjoy;
    }
}

