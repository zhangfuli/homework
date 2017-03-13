import Example_1.Example_1;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        //例一，创建文件并获得文件属性
        Example_1 example_1 = new Example_1();
        File newFile = example_1.newFile("new.txt");
        example_1.print(newFile);

    }
}
