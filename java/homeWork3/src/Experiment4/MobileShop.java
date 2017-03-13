package Experiment4;

/**
 * Created by zfl on 2016/10/14.
 */
public class MobileShop {
    private int mobileAmount;   //手机数量
    public class InnerPurchaseMoney{
        private int price;
        public void setInnerPurchaseMoney(int p){
            price = p;
        }
    }
    public InnerPurchaseMoney purchaseMoney = new InnerPurchaseMoney();
    //用购物券买手机
    public void buyMobile(){

        int buyamount = (purchaseMoney.price / 10000)*3;
        this.mobileAmount = this.mobileAmount - buyamount;
        System.out.println("用价值"+purchaseMoney.price+"的内部购物券买了"+buyamount+"部手机");
    }
    public void setMobileAmount(int m){
        mobileAmount = m;
    }
    public void getMobileAmount(){
        System.out.println("手机专卖店目前有"+mobileAmount+"部手机");
    }
}
