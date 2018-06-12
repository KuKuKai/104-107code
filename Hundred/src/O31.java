import java.util.Scanner;

public class O31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("��J�@�Ʀrx");
        int x = scn.nextInt();
        if(x<-1){
        	System.out.println("y="+(3*x*x));
        }else{
        	if(x>=-1&&x<=1){
        		System.out.println("y="+(x*x*x+3*x-3));
        	}else{
        		if(x>1){
        			System.out.println("y="+(2*x+3));
        		}
        	}
        }
	}

}