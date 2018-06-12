import java.util.Scanner;
public class fifth05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�п�J��몺�u�ɼ�");
        int t = scn.nextInt();
        System.out.println("�п�J�C�몺�T�w���~");
        int m = scn.nextInt();
        if(t<=60){
        	System.out.println(t*m+"���A���o���~��");
        }
        if(60<t&&t<=120){
        	double a =(t-60)*m*1.33+60*m;
        	System.out.println(a+"���A���o���~��");
        }
        if(t>120){
        	double b =(t-120)*m*1.66+60*m*1.33+60*m;
        	System.out.println(b+"���A���o���~��");
        }
	}

}