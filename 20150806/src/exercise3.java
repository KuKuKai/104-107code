import java.util.Scanner;
public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int i;
        int sum = 0;
        for (i=13 ; i <=1399 ; i=i+1){
        	sum = sum+i;
        }
        	System.out.println("sum=" +sum);
	}

}
