package experiment1;

/**
 * Created by zfl on 2016/9/30.
 */
public class AmericanPeople extends People {
    protected double height = 176.0;
    protected double weight = 75.0;
    public void speakHello(){
        System.out.println("How do you do");
    }
    public void averageHeight(){
        System.out.println("American's average height is"+height+"cm");
    }
    public void averageWeight(){
        System.out.println("American's average weight is"+weight+"kg");
    }
    public void americanBoxing(){
        System.out.println("直拳，钩拳，组合拳");
    }
}
