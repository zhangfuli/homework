package com.company;

import TV.*;
import water.Village;

public class Main {

    public static void main(String[] args) {
    //实验一           机动车
        Vehicle car = new Vehicle();
        int changeSpeed = 5;
        System.out.println("初始速度为"+car.speed);
        car.speedUp(changeSpeed);
        System.out.println("加速后为"+car.speed);
        car.speedDown(changeSpeed);
        System.out.println("再减速为"+car.speed);
        car.setPower(10);
        System.out.println("设置的功率为"+car.getPower());

    //实验二       家中的电视
        TV haierTV = new TV();
        Familiy zhangSanFamily = new Familiy();
        haierTV.setChannel(5);         //设置频道为5
        zhangSanFamily.buyTV(haierTV);
        zhangSanFamily.setTV();
        zhangSanFamily.remoteControl(6);  //重新设的频道为6
        System.out.println("设置的频道为:"+zhangSanFamily.homeTV.getChannel());

        //实验3 共同饮水
        Village village1 = new Village();
        Village village2 = new Village();
        System.out.println("原先的水量为:"+village1.getwaterAmount());
        village1.useWater(2);      //村子一用了2L水
        System.out.println("村子一用后的水量为:"+village2.getwaterAmount());

    }
}
