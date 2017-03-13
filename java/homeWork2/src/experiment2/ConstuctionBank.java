package experiment2;

/**
 * Created by zfl on 2016/9/30.
 */
public class ConstuctionBank extends Bank {
    protected double year;
     public ConstuctionBank(double year,int savedMoney){
        super();
        super.year = (int)year;
        this.year = year;
        this.savedMoney = savedMoney;
        super.savedMoney = savedMoney;
    }
    public double computerInterest(){
        double day = year - super.year;
        day = day * 1000;
        double dayInterest =(int)day*0.0001*savedMoney;
        double yearIntersert = super.computerInterest();
        return dayInterest+yearIntersert;
    }

}
