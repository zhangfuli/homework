package Experiment5;

/**
 * Created by zfl on 2016/10/14.
 */
public class Machine {
    public void checkBag(Goods good)throws DangerException{
        if(good.isDanger == true){
            throw new DangerException(good.name);
        }
        else {
            System.out.println(good.name+"不是危险品，"+good.name+"检查通过");
        }
    }
}
