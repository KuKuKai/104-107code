import java.util.Scanner;
public class O24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
		System.out.println("�ХѤp��j��J�T���ΤT���");
        Float a = scn.nextFloat();
        Float b = scn.nextFloat();
        Float c = scn.nextFloat();
        if(a+b>c && b-a<c){
     	   System.out.println("True");
        }else{
     	   System.out.println("False");
        }
	}

}