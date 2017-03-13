package Example_5;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by zfl on 2016/10/21.
 */
public class Example_5 {
    public static void main(String args[]){
        File fRead = new File("english.txt");
        File fWrite = new File("englishCount.txt");
        if(!fWrite.exists()){
            try {
                fWrite.createNewFile();
            }catch (Exception e){
                System.err.println(e);
            }
        }
        try{
            Writer out = new FileWriter(fWrite);
            BufferedWriter bufferedWrite = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader bufferedReade = new BufferedReader(in);
            String str = null;
            while((str = bufferedReade.readLine())!=null){
                StringTokenizer fenxi = new StringTokenizer(str);
                int count = fenxi.countTokens();
                str = str+ "句子的单词数："+count;
                bufferedWrite.write(str);
                bufferedWrite.newLine();
            }
            bufferedWrite.close();
            out.close();
            in = new FileReader(fWrite);
            bufferedReade = new BufferedReader(in);
            String s = null;
            System.out.println(fWrite.getName()+"内容：");
            while ((s = bufferedReade.readLine())!=null){
                System.out.println(s);
            }
            bufferedReade.close();
            in.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
