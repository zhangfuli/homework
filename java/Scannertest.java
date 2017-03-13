import java.util.Scanner;
public class Scannertest{
	public static void main (String args[]){
		System.out.println("Please input some numbers,press enter to end");
		System.out.println("The end of 0");

		Scanner reader = new Scanner(System.in);
		double sum = 0;
		double x = reader.nextDouble();
		while(x	!= 0){
			sum = sum +x;
			x = reader.nextDouble();
		}
		System.out.println("sum = "+sum);
	}
}