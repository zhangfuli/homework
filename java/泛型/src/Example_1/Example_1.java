package Example_1;

/**
 * Created by zfl on 2016/10/28.
 */
public class Example_1 {
    public static void main(String args[]){
        Circle circle = new Circle(10);
        Cone<Circle> coneOne =new Cone<Circle>(circle);
        coneOne.setHeight(16);
        System.out.println(coneOne.computerVolume());
        React react = new React(15,23);
        Cone<React> coneTwo=new Cone<React>(react);
        coneTwo.setHeight(98);
        System.out.println(coneTwo.computerVolume());
    }
}
