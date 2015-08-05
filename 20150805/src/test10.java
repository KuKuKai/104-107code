import java.util.Scanner;
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入性別與身高");
		String a = scn.next();
		double b = scn.nextDouble();
		double c = (b-170)*0.6+65;
		double d = (b-158)*0.5+52;
		if(a.equals("男")){
			System.out.println(c);
		}else{
			if(a.equals("女"))
			System.out.println(d);
			
		}
				}

}
