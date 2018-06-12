import java.util.Scanner;

public class sixth01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�K�X(4�X)");
        for(int i=0;i<10000;i++){
		int a = scn.nextInt();
        if(a<1000 || a>10000){
        	System.out.println("��J�榡���~�A�ЦA�դ@��");
        }else{
    		for (int j = 0; j < 3; j++) {
    			System.out.println("�п�J��2���K�X");
    			int b = scn.nextInt();
    	        if(b<1000 || b>10000){
    	        	System.out.println("��J�榡���~�A�ЦA�դ@��");
    	        }else{
    			if (a == b) {
    				System.out.println("�K�X��J���T");
    				break;
    			} else {
    				System.out.println("��J���~");
    			}
    	        }
    		}
        	break;
        }
        }

	}

}