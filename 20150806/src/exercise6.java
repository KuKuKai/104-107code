import java.util.Scanner;
public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		int i;
		float sum1 = 0;
		float sum2 = 0;
		for(i=1;i<=c;i=i+1){
		sum1 = sum1+scn.nextFloat();
		sum2 = sum2+scn.nextFloat();
		}
		System.out.println("平均身高="+sum1/c+"體重平均="+sum2/c);
	}

}
