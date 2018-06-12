import java.util.Scanner;
public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m =0,sum = 0;
        while(sum<=n){
        	m++;
        	sum+=m;
        }System.out.println(m-1);
	}

}