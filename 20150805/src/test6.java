import java.util.Scanner;
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("�ХѤp��j��J���");
           Float a = scn.nextFloat();
           Float b = scn.nextFloat();
           Float c = scn.nextFloat();
           if(a*a+b*b == c*c){
           System.out.println("���������T����");
	}else{
		if(a*a+b*b>c*c){
			System.out.println("�����U���T����");
		}else{
			System.out.println("�����w���T����");
		}
	}
	}

}
