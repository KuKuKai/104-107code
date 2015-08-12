import java.util.Scanner;
public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int m =scn.nextInt();
        int sum=0;
        for(int i=0;i<=m;i++){
        	sum+=i*(i+1);
        }
        System.out.println("sum="+sum);
	}

}
