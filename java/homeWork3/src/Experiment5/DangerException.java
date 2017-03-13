package Experiment5;

/**
 * Created by zfl on 2016/10/14.
 */
public class DangerException extends Exception{
    String name;
    DangerException(String n){
        name = n;
    }
    public void toShow(){
        System.out.println("属于危险品!"+name+"被禁止");
    }
}
