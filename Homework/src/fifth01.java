import java.util.Scanner;
public class fifth01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        while(0<=a&&a<101){
        if(90<=a&&a<=100){
        	System.out.println("A");
        }
        if(80<=a&&a<=89){
        	System.out.println("B");
        }
        if(70<=a&&a<=79){
        	System.out.println("c");
        }
        if(60<=a&&a<=69){
        	System.out.println("D");
        }
        if(a<60){
        	System.out.println("E");
        }break;
        }
	}

}