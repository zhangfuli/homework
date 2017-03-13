package Example_6;

/**
 * Created by zfl on 2016/10/28.
 */
public class ClassRoom implements Runnable{
    Thread student,teacher;
    ClassRoom(){
        teacher = new Thread(this);
        student = new Thread(this);
        teacher.setName("王教授");
        student.setName("张三");
    }
    public void run(){
        if (Thread.currentThread() == student){
            try{
                System.out.println(student.getName()+"正在睡觉，不听课");
                Thread.sleep(1000*60*60);
            }catch (Exception e){
                System.err.println(e);
            }
        }
        else if(Thread.currentThread() == teacher){
            for(int i=1;i<=3;i++){
                System.out.println("上课！");
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                    System.err.println(e);
                }
                student.interrupt();
            }
        }
    }

}
