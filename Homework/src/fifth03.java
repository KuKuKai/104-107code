import java.util.Scanner;
public class fifth03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�п�J�K�X(4�X)");
        for(int i=0;i<10000;i++){
        int a = scn.nextInt();
        if(a<1000 || a>=10000){
        	System.out.println("��J�榡���~");
        }else
        	if(a==1314){
        		System.out.println("��J���T");break;
        	}else{
        		System.out.println("�K�X���~�A�ЦA�դ@��");
        	}
	}
	}
}