/**
 * Created by zfl on 2017/6/28.
 */
public class Children extends Father implements Imple,Imple2 {
    Children(){
        System.out.println("This is children");
    }
//    public void function(int num){
//        System.out.println("This is int");
//    }
    public void function(float num){
        System.out.println("This is float");
    }
    public void function(double num){
        System.out.println("This is double");
    }

    @Override
    public void TestImple() {
        System.out.println("This is TestImple");
    }
}
