package secondJava;

import java.util.Scanner;

public class SecondJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("請輸入上底");
           float U = scn.nextFloat();
           System.out.println("請輸入下底");
           float D = scn.nextFloat();
           System.out.println("請輸入高");
           float H = scn.nextFloat();
           float A = (U+D)*H/2;
           System.out.println("面積是"+A);
	}

}
