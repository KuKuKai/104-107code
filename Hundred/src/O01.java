import java.util.Scanner;
public class O01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        int sum = 0;
        int len = a.length();
        char[] c =a.toCharArray();
        for(int i=0;i<len;i++){
        	int d=c[i]-'0';
        sum+=d;
        }System.out.println(sum);
	}

}