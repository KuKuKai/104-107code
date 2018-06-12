import java.util.Scanner;

public class O49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        while(n>0){
        	n/=10;
        	a++;
        }System.out.println(a+"���");
	}

}