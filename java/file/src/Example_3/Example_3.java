package Example_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zfl on 2016/10/21.
 */
public class Example_3 {
    public static void main(String args[]){
        int n = -1;
        byte [] a= new byte[100];
        try {
            File f = new File("E:\\练习\\java\\file\\src\\Example_3\\Example_3.java");
            InputStream in = new FileInputStream(f);
            System.out.println(123);
            while((n = in.read(a,0,100))!=-1){
                String s = new String(a,0,n);
                System.out.println(s);
            }
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
