import java.util.Scanner;
public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 1,sum = n;
        while(sum<=10000){
        	sum=sum*n;
        	a++;
        }System.out.println(a);
	}

}