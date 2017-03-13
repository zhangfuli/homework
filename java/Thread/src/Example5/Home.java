package Example5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zfl on 2016/10/28.
 */
public class Home implements Runnable{
    int time=0;
    SimpleDateFormat m = new SimpleDateFormat("hh:mm:ss");
    Date date;
    public void run(){
        while(true){
            date = new Date();
            System.out.println(m.format(date));
            time++;
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.err.println(e);
            }
            if(time == 3){
                Thread thread = Thread.currentThread();
                thread = new Thread(this);
                thread.start();
            }
        }
    }

}
