import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        float m = 100000;
        float A = 50*m;
        float a = 20000;
        int h = 1;
        double t = 0.78*A;
        while(t+a<A){
        a = (float) (a+a*0.15);
        h++;
        }
        System.out.println(h);
   }
}
