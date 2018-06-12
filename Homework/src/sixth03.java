import java.util.Scanner;
public class sixth03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double v1 = Math.ceil(n/2);
        double v2 = n-v1;
        for(int i=0;i<=v1;i++){
        	for(int j=0;j<v1-i;j++){
        		System.out.print(" ");
        	}
        	for(int k=0;k<=2*i;k++){
        		System.out.print("*");
        	}
        	System.out.println();
        }
        for(int i=1;i<=v2-1;i++){
        	for(int j=0;j<i;j++){
        		System.out.print(" ");
        	}
        	for(int k=0;k<=(v2-i-1)*2;k++){
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}