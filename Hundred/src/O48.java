import java.util.Scanner;

public class O48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n>0){
        	System.out.print(n%10);
        	n/=10;
        }
	}

}