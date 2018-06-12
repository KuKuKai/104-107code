import java.util.Scanner;
public class O25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�ХѤp��j��J���");
        Float a = scn.nextFloat();
        Float b = scn.nextFloat();
        Float c = scn.nextFloat();
        if(a*a+b*b == c*c){
        System.out.println("Right triangle");
	}else{
		if(a*a+b*b>c*c){
			System.out.println("Acute triangle");
		}else{
			System.out.println("Obtuse triangle");
		}
	}
	}

}