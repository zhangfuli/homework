package experiment1;

/**
 * Created by zfl on 2016/9/30.
 */
public class ChinaPeople extends People {
    protected double height=168.78;
    protected double weight = 65.0;
    public void speakHello(){
        System.out.println("您好");
    }
    public void averageHeight(){
        System.out.println("中国人的平均身高为"+height+"cm");
    }
    public void averageWeight(){
        System.out.println("中国人的平均体重问为"+weight+"kg");
    }
    public void chinaGongfu(){
        System.out.println("坐如钟，站如松，睡如弓");
    }
}
