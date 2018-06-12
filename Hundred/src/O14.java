import java.util.Scanner;
public class O14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int w = scn.nextInt();
        for(int i=1;i<=w;i++){
        	for(int j=1;j<=h;j++){
        		System.out.print(i*j+"\t");
        	}System.out.println("");
        }
    }
}