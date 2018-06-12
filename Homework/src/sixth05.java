import java.util.Scanner;
public class sixth05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�п�JX��N");
        double x = scn.nextInt();
        double n = scn.nextInt();
        double sum = 0;
        for (int i=1;i<=n;i++){
        	sum += (x+i)/(n-(i-1));
        }
        System.out.println(sum);
	}

}