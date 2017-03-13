import experiment1.AmericanPeople;
import experiment1.BeijingPeople;
import experiment1.ChinaPeople;
import experiment2.BankDalian;
import experiment2.ConstuctionBank;
import experiment3.*;

public class Main {

    public static void main(String[] args) {
        //实验一
        ChinaPeople zhangsan = new ChinaPeople();
        BeijingPeople lisi = new BeijingPeople();
        AmericanPeople peter = new AmericanPeople();
        zhangsan.speakHello();
        peter.speakHello();
        lisi.speakHello();
        zhangsan.averageHeight();
        peter.averageHeight();
        lisi.averageHeight();
        zhangsan.averageWeight();
        peter.averageWeight();
        lisi.averageWeight();
        zhangsan.chinaGongfu();
        peter.americanBoxing();
        lisi.beijingOprea();
        lisi.chinaGongfu();

        //实验二
        int savedMoney = 8000;
        double year = 8.236;
        ConstuctionBank constuction = new ConstuctionBank(year,savedMoney);
        double ConsuctionInterest = constuction.computerInterest();
        System.out.println(savedMoney+"元存在建设银行"+(int)year+"年"+(int)((year-(int)year)*1000)+"天的利息为"+ConsuctionInterest+"元");
        BankDalian dalian = new BankDalian(year,savedMoney);
        double DalainInterest = dalian.computerInterest();
        System.out.println(savedMoney+"元存在大连银行"+(int)year+"年"+(int)((year-(int)year)*1000)+"天的利息为"+DalainInterest+"元");
        System.out.println("两银行的利息差为"+Math.abs(ConsuctionInterest-DalainInterest)+"元");

        //实验3
        Company company = new Company();
        company.employee = new Employee[3];
        try {
            company.employee[0] = new MonthWorker();
            company.employee[1] = new WeekWorker();
            company.employee[2] = new YearWorker();
            for (int i = 0; i < 3; i++) {
                company.employee[i].earnings();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
