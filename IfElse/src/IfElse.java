import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("請輸入A值:");
           Float A = scn.nextFloat();
           System.out.println("請輸入B值:");
           Float B = scn.nextFloat();
           if(A>B){
        	   System.out.println(""+A+">"+B+"");
           }else{
           if(A<B){
        	   System.out.println(""+A+"<"+B+"");
           }else{
        	   System.out.println(""+A+"="+B+"");
           }
           }
	}

}
