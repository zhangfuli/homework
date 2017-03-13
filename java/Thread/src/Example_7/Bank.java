package Example_7;

/**
 * Created by zfl on 2016/10/28.
 */
public class Bank implements Runnable{
    int money = 200;

    public void setMoney(int money) {
        this.money = money;
    }

    public void run(){
        if(Thread.currentThread().getName().equals("会计"))
            saveOrTake(300);
        else if(Thread.currentThread().getName().equals("出纳"))
            saveOrTake(150);

    }
    public synchronized void saveOrTake(int amount){
        if (Thread.currentThread().getName().equals("会计")){
            for(int i=1;i<=3;i++){
                money = money +amount/3;
                System.out.println(Thread.currentThread().getName()+"存入"+amount/3
                +",账上有"+money+"万，休息一会再存");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.err.println(e);
                }
            }
        }
        else  if (Thread.currentThread().getName().equals("出纳")){
            for(int i=1;i<3;i++){
                money =money-amount/3;
                System.out.println(Thread.currentThread().getName()+"取出"+amount/3+",账上有"+money+"万，休息一会儿再取");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.err.println(e);
                }
            }
        }
    }
}
