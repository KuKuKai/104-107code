import java.util.Scanner;
public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = 13;
		int sum = 0;
				if( n%2==1){
		for(n=13;n<=1399;n=n+2){
			sum = sum+n;
		}
		System.out.println("sum="+sum);
				}
	}

}
