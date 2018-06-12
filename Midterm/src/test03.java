import java.util.Scanner;
public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        while(n>0){
        	System.out.print(n%10);
        	n/=10;
        	a++;
        }System.out.println("\n"+a+"���");
	}

}