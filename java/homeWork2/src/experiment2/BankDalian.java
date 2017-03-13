package experiment2;

/**
 * Created by zfl on 2016/9/30.
 */
public class BankDalian extends Bank {
    protected double year;
    public BankDalian(double year,int savedMoney){
        super.year = (int)year;
        this.year = year;
        this.savedMoney = savedMoney;
        super.savedMoney = savedMoney;
    }
    public double computerInterest(){
        double yearInterest = super.computerInterest();
        double dayInterest = (int)((year-super.year)*1000)*0.00012*savedMoney;
        return dayInterest+yearInterest;
    }
}
