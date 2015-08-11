import java.util.Scanner;
import java.util.Random;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int v2=0;
        int[] data = new int[10];
        for(int i=0;i<10;i++){
        	data[i]=rnd.nextInt(100);
        	if(data[i]%2==0){
        		v2++;
        	}
        }
        int j =1;
		while(j<4){
			System.out.println("¿é¤Jµª®×");
			int m=scn.nextInt();
		if(m==v2){
			System.out.println("Bingo!");
			j=5;
		}else{
			System.out.println("Please try again!");
			j++;
			if(j==4){
				System.out.println("You lose");
			}
		}
		}
        for(int i=0;i<10;i++){
		System.out.println(data[i]);
		}
	}
}
