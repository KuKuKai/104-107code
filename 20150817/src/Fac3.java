import java.util.Scanner;
public class Fac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.print("�п�J�Ʀr:");
        int n=scn.nextInt();
        System.out.print(fun(n)+"���");
	}
public static int fun(int n){
	if(n<10&&n>0){
		return 1;
	}else{
		return 1+fun(n/10);
	}
}
}
