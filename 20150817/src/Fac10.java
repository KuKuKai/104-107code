import java.util.Scanner;
public class Fac10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("�п�J�@��:n");
        int n =scn.nextInt();
        System.out.print("���׬�:"+fun(n));
	}
	public static int fun(int n){
		int j =0;
		for(int i=1;i<=n;i++){
			double k=Math.pow(2, i); 
			j+=k;
		}
		return j;
	}

}
