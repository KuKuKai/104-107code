import java.util.Scanner;
public class O36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int m =scn.nextInt();
        int sum=1;
        int i = 1;
        while(i<=m){
        	sum*=i;
        	i++;
        }
        System.out.println("sum="+sum);
	}

}