package Example_4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by zfl on 2016/10/21.
 */
public class Example_4 {
    public static void main(String argc[]){
        byte[] a = "新年快乐".getBytes();
        byte[] b = "Happy New Year".getBytes();
        File file = new File("a.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (Exception e){
                System.err.println(e);
            }

        }
        try {
            OutputStream out = new FileOutputStream(file);
            System.out.println(file.getName()+"的大小："+file.length()+"字节");
            out.write(a);
            out.close();
            out = new FileOutputStream(file,true);
            System.out.println(file.getName()+"的大小："+file.length()+"字节");
            out.write(b,0,b.length);
            System.out.println(file.getName()+"的大小："+file.length()+"字节");
            out.close();
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
