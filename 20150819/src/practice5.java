import java.util.Scanner;
public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入一整數n與b進位法:");
        int count=0;
        int n=scn.nextInt();
        int b=scn.nextInt();
        fun(n,b);
	}
	public static void fun(int n,int b){
        String str ="";
        while(n>=b){
        str =Integer.toString(n%b)+str;
        n=n/b;
        }
        System.out.println(n+str);
	}

}
