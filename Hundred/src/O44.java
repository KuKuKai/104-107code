import java.util.Scanner;
public class O44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=0;
        while(i<n){
        	for(int j=0;j<n-i-1;j++){
        		System.out.print(" ");
        	}
        	for(int j=0;j<=i;j++){
        		System.out.print("*");
        	}
        	i++;
        	System.out.println("");
        }
	}

}