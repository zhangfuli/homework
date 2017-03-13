package Example_2;

import java.io.File;

/**
 * Created by zfl on 2016/10/21.
 */
//Runtime里的exec可以打开exe和网页
public class Example_2 {
    public static void main(String args[]){
        try {
            Runtime ce = Runtime.getRuntime();
            File file = new File("D:\\sourcetree2\\SourceTree.exe");//注意打开的是exe文件不是快捷方式
            ce.exec(file.getAbsolutePath());
            file = new File("C:\\Users\\zfl\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
            ce.exec(file.getAbsolutePath());
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
