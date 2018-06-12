import java.util.Scanner;
public class OO9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ʧO�Ψ���:");
		String a = scn.next();
		double b = scn.nextDouble();
		double c = (b-170)*0.6+65;
		double d = (b-158)*0.5+52;
		if(a.equals("�k")){
			System.out.println(c);
		}else{
			if(a.equals("�k"))
			System.out.println(d);
			
		}
	}

}