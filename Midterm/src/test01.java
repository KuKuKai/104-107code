import java.util.Scanner;
public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�п�J�����n");
        int n = scn.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
        	sum +=i*(i+1);
        }
        System.out.println(sum);
	}

}