import java.util.*;
class findNumber{
	public static void main(String[] args) {
		int start =0,end,middle;
		System.out.println("PLease put in a number");
		int a[]={12,45,67,89,123,-45,67};
		int N = a.length;
		int n=0;

		Scanner scanner = new Scanner(System.in);
		double  num= scanner.nextDouble();
		for (int i=0; i<N;i++){
			if(a[i]==num){
				int j= i+1;
				System.out.println("Find it ! The number is in "+j+ " of the array");
			}
			else{
				n++;
			}
		}
		if(n==N){
			System.out.println("I have no find it");
		}
	}
}