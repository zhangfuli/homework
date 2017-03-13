package experiment1;

/**
 * Created by zfl on 2016/9/30.
 */
public class BeijingPeople extends ChinaPeople {
    protected double height = 172.5;
    protected double weight = 70.0;
    public void speakHello(){
        System.out.println("您好");
    }
    public void averageHeight(){
        System.out.println("北京人的平均身高为"+height+"cm");
    }
    public void averageWeight(){
        System.out.println("北京人的平均体重为"+weight+"kg");
    }
    public void beijingOprea(){
        System.out.println("花脸，青衣，花旦和老生");
    }
}
