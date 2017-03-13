package Example_1;

/**
 * Created by zfl on 2016/10/28.
 */
public class Circle {
    double area,radius;
    Circle(double r){
        radius = r;
    }

    @Override
    public String toString() {
        area= radius*radius*Math.PI;
        return ""+area;
    }
}
