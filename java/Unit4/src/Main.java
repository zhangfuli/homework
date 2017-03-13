public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //计算梯形的面积
        Lader lader = new Lader(2,5,4);
        System.out.println("梯形的面积为 "+lader.computerArea());
        lader.setHeight(9);
        System.out.println("新的梯形的面积为 "+lader.computerArea());

        //成员变量和局部变量
        VariableAndLocal variableAndLocal = new VariableAndLocal();
        variableAndLocal.print();

        //引用
        Quote quote1 = new Quote();
        Quote quote2 = new Quote();
        System.out.println("quote1的引用："+quote1);
        System.out.println("quote2的引用："+quote2);
        quote1.setXY(1111,2222);
        quote2.setXY(-100,-200);
        System.out.println("quote1的x，y的坐标：("+quote1.x+","+quote1.y+")");
        System.out.println("quote2的x，y的坐标：("+quote2.x+","+quote2.y+")");

    }
}
