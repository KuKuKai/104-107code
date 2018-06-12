import java.util.Scanner;
public class O20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String i =scn.next();
        int b =Integer.parseInt(i);
        int len = i.length();
        char [] a= i.toCharArray();
        for(int j=0;j<len;j++){
        	b=a[j]-'0';
        	System.out.print(b+"\t");
        }
	}

}