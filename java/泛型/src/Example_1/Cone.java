package Example_1;

import java.util.DoubleSummaryStatistics;

/**
 * Created by zfl on 2016/10/28.
 */
public class Cone<E> {
    double height;
    E bottom;
    public Cone(E b){
        bottom = b;
    }
    public void setHeight(double h){
        height = h;
    }
    public double computerVolume(){
        String s = bottom.toString();
        double area = Double.parseDouble(s);
        return 1.0/3.0*area*height;
    }
}
