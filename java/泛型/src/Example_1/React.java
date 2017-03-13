package Example_1;

/**
 * Created by zfl on 2016/10/28.
 */
public class React {
    double sideA,sideB,area;
    React(double a,double b){
        sideA = a;
        sideB = b;
    }

    @Override
    public String toString() {
        area = sideA*sideB;
        return ""+area;
    }
}
