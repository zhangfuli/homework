package experiment1;

/**
 * Created by zfl on 2016/9/30.
 */
public class People {
    protected double height=160.0;
    protected double weight=70.0;
    public void speakHello(){
        System.out.println("您好");
    }
    public void averageHeight(){
        System.out.println("平均身高为"+height+"kg");
    }
    public void averageWeight(){
        System.out.println("平均身高为体重为"+weight+"kg");
    }
}
