import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
		System.out.println("�ХѤp��j��J�T���ΤT���");
           Float a = scn.nextFloat();
           Float b = scn.nextFloat();
           Float c = scn.nextFloat();
           if(a+b>c && b-a<c){
        	   System.out.println("�����T����");
           }else{
        	   System.out.println("���D�T����");
           }
	}

}
