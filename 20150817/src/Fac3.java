import java.util.Scanner;
public class Fac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.print("請輸入數字:");
        int n=scn.nextInt();
        System.out.print(fun(n)+"位數");
	}
public static int fun(int n){
	if(n<10&&n>0){
		return 1;
	}else{
		return 1+fun(n/10);
	}
}
}
