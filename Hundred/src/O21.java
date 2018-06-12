import java.util.Random;
import java.util.Scanner;
public class O21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
        int i = rnd.nextInt(5)+1;
        //System.out.print(i);
        int j = scn.nextInt();
        if(j==i){
        	System.out.println("���߲q��");
        }else{
        	System.out.println("�u�i���A���׬O:"+i);
        }
	}

}