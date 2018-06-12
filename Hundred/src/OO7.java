import java.util.Scanner;
public class OO7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scn = new Scanner(System.in);
	    String a =scn.next();
	    char x = a.charAt(0);
		if(65<=x && x<=90){
			x=(char) (x+32);
	    	System.out.println(x);
	    }else {
	        if(97<=x && x<=122){
	        	x=(char) (x-32);
	        	System.out.println(x);
	        }
	    }
	}

}