package Example5;

/**
 * Created by zfl on 2016/10/28.
 */
public class Example_5 {
    public static void main(String args[]){
        Home home = new Home();
        Thread showTime = new Thread(home);
        showTime.start();
    }
}
