package com.company;

/**
 * Created by zfl on 2016/9/28.
 */
public class SIMOfChinaMobile extends SIM {
    String number;
    public void setNumber (String n){
        number = n;
    }
    public String giveNumber(){
        return number;
    }
    public String giveCorpName(){
        return "中国移动";
    }
}
