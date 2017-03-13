package Example_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zfl on 2016/11/2.
 */
public class Example_2 {
    public static void main(String args[]){
        List<String> list = new LinkedList<String>();
        for(int i = 0; i<=60096;i++){
            list.add("speed"+i);
        }
        Iterator<String> iter = list.iterator();
        long starttime = System.currentTimeMillis();
        while(iter.hasNext()){
            String te= iter.next();
        }
        long endTime= System.currentTimeMillis();
        long result=endTime-starttime;
        System.out.println("使用迭代器遍历集合所用的时间："+result+"毫秒");
        starttime=System.currentTimeMillis();
        for(int i=0;i<list.size();i++){
            String te=list.get(i);
        }
        endTime = System.currentTimeMillis();
        result =endTime-starttime;
        System.out.println("使用get方法遍历集合所用的时间："+result+"毫秒");
    }
}
