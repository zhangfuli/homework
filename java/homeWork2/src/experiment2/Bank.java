package experiment2;

/**
 * Created by zfl on 2016/9/30.
 */
public class Bank {
    protected int savedMoney;
    protected int year;
    protected double interest;
    public double computerInterest(){
        interest = year*0.035*savedMoney;
        return interest;
    }
}
