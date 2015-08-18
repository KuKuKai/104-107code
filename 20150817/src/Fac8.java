import java.util.Scanner;
public class Fac8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入一數:n");
        int n =scn.nextInt();
        System.out.print("答案為:"+fun(n));
	}
	public static int fun(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			sum+=i*(i+1);
		}
		return sum;
	}

}
