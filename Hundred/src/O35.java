import java.util.Scanner;
public class O35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int m =scn.nextInt();
        int sum=1;
        for(int i=1;i<=m;i++){
        	sum*=i;
        }
        System.out.println("sum="+sum);
	}

}