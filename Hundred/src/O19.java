import java.util.Scanner;
public class O19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
		String a =scn.next();
		char i = a.charAt(0);
		if(65<=i && i<=90){
			System.out.println(a+"���j�g");
		}else if(97<=i && i<=122){
			System.out.println(a+"���p�g");
		}else{
			System.out.println(a+"��L�r��");
		}
	}

}