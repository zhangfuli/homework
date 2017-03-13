
import Experiment1.Gymnastics;
import Experiment1.School;

import Experiment2.*;
import Experiment3.*;
import Experiment4.MobileShop;
import Experiment5.DangerException;
import Experiment5.Goods;
import Experiment5.Machine;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        //实验一
        System.out.println("请输入打了多少个分");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if(num<=2){
            System.out.println("请输入大于2的数");
            exit(1);
        }
        System.out.println("请依次输入成绩");
        double score[] = new double[num];
        for(int i = 0;i<num;i++){
            score[i] = sc.nextDouble();
        }
        Gymnastics gy = new Gymnastics();
        System.out.println("体操选手最后的得分："+gy.computed(num,score));
        School school = new School();
        System.out.println("班级考试的平均分数："+school.computed(num,score));
        //实验二
        Truck truck1 = new Truck();
        truck1.computeweight = new ComputeWeight[3];
        truck1.computeweight[0] =  new Television();
        truck1.computeweight[1] =  new Computer();
        truck1.computeweight[2] = new WashMachine();
        double totalsales = 0.0;
        for(int i = 0;i<3;i++){
            totalsales = totalsales + truck1.computeweight[i].computeWeight();
        }
        System.out.println("货车装载的货物重量："+totalsales+"kg");
        //实验三
        Dog dog = new Dog();
        dog.state = new SoftlyState();
        dog.show();
        dog.state = new Enemy();
        dog.show();
        dog.state = new Friend();
        dog.show();
        dog.state = new Companions();
        dog.show();
        //实验四
        MobileShop shop = new MobileShop();
        shop.setMobileAmount(30);
        shop.purchaseMoney.setInnerPurchaseMoney(20000);  //给20000的购物券
        shop.buyMobile();   //用购物券买手机
        shop.purchaseMoney.setInnerPurchaseMoney(10000);
        shop.buyMobile();
        shop.getMobileAmount();

        //实验五
        Machine machine = new Machine();
        Goods apple = new Goods("苹果",false);
        Goods xifu = new Goods("西服",false);
        Goods zhayao = new Goods("炸药",true);
        Goods liusuan = new Goods("硫酸",true);
        Goods watch = new Goods("手表",false);
        Goods liuhuang = new Goods("硫磺",true);
        try {
            machine.checkBag(apple);
        }catch (DangerException err){
            err.toShow();
        }try {
            machine.checkBag(xifu);
        }catch (DangerException err){
            err.toShow();
        }try{
            machine.checkBag(zhayao);
        }catch (DangerException err){
            err.toShow();
        }try{
            machine.checkBag(liusuan);
        }catch (DangerException err){
            err.toShow();
        }try{
            machine.checkBag(watch);
        }catch (DangerException err){
            err.toShow();
        }try{
            machine.checkBag(liuhuang);
        }catch (DangerException err){
            err.toShow();
        }


    }
}
