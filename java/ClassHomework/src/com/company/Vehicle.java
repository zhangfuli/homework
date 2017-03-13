package com.company;

/**
 * Created by zfl on 2016/9/21.
 */
public class Vehicle {
    double speed = 6.0;
    int power;
    void speedUp(int s){      //加速功能
        this.speed = this.speed + s;
    }
    void speedDown(int s){   //减速功能
        this.speed = this.speed - s;
    }
    void setPower(int power){   //设置功率
        this.power = power;
    }
    double getSpeed(){        //得到速度
        return speed;
    }
    double getPower(){       //得到功率
        return power;
    }
}
