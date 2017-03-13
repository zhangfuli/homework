package com.company;

import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String instanceOf = new String();
        if(instanceOf instanceof String){              //判断是不是string生成的对象
            System.out.println("instanceOf is String's Object");
        }
        else {
            System.out.println("instanceOf isn't String's Object");
        }
//*******************************************百度一面试题******************************
        if(new Object(){
            public boolean foo(){
                System.out.print("a");
                return false;
            }
            }.foo()){
            System.out.print("a");
        }else {
            System.out.println("b");
        }


//        **************************unit5 应用举例***********************
        MobileTelephone telephone = new MobileTelephone();
        SIM sim = new SIMOfChinaMobile();
        sim.setNumber("17806272950");
        telephone.useSIM(sim);
        telephone.showMess();
        sim = new SIMOfChinaUnicom();
        sim.setNumber("123456789");
        telephone.useSIM(sim);
        telephone.showMess();


    }
}
