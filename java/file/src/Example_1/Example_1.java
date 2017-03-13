package Example_1;

import java.io.File;
import java.io.IOException;

/**
 * Created by zfl on 2016/10/21.
 */
public class Example_1 {
    public void print(File file){
        System.out.println(file.getName()+"是可读的吗："+file.canRead());
        System.out.println(file.getName()+"的长度"+file.length());
        System.out.println(file.getName()+"的绝对路径："+file.getAbsolutePath());
    }
    public File newFile(String filename){
        File file = new File(filename);
        System.out.println("在当前路径下创建文件："+file.getName());
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("创建成功");
            }catch (IOException err){
                System.err.println(err);
            }
        }
        return file;
    }
}
