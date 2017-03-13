package Example_7;

/**
 * Created by zfl on 2016/10/28.
 */
public class Example_7 {
    public static void main(String args[]){
        Bank bank =new Bank();
        bank.setMoney(200);
        Thread account,cashier;
        account = new Thread(bank);
        cashier = new Thread(bank);
        account.setName("会计");
        cashier.setName("出纳");
        account.start();
        cashier.start();
    }
}
