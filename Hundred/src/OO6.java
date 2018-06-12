import java.util.Scanner;
public class OO6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scn = new Scanner(System.in);
	    String a =scn.next();
	    char x = a.charAt(0);
		if(65<=x && x<=90){
			System.out.println("uppercase");
		}else if(97<=x && x<=122){
			System.out.println("lowercase");
		}else{
			System.out.println("special character");
		}
	}

}