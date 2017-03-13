package water;

/**
 * Created by zfl on 2016/9/21.
 */
public class Village {
    public static int waterAmount = 10;
    public void useWater(int num){
        this.waterAmount = this.waterAmount - num;
    }
    public int getwaterAmount(){
        return waterAmount;
    }
}
