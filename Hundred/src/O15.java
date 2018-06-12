import java.util.Scanner;
public class O15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("�п�J����(cm)���魫(kg):");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        double en = n/2.54;
        double em = m/0.454;
        System.out.println(en+"�T");
        System.out.println(em+"�S");
	}

}