import java.util.Scanner;
public class Fac8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("�п�J�@��:n");
        int n =scn.nextInt();
        System.out.print("���׬�:"+fun(n));
	}
	public static int fun(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			sum+=i*(i+1);
		}
		return sum;
	}

}
