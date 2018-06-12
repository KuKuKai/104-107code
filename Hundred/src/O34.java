import java.util.Scanner;

public class O34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�п�J��몺�ϥήɶ�(����)");
        int t = scn.nextInt();
        if(t<=600){
        	System.out.println(t*0.5+"�����A���I���q�ܶO");
        }
        if(600<t&&t<=1200){
        	System.out.println(t*0.5*0.9+"�����A���I���q�ܶO");
        }
        if(t>1200){
        	System.out.println(t*0.5*0.79+"�����A���I���q�ܶO");
        }
	}

}