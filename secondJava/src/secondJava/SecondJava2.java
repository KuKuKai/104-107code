package secondJava;

import java.util.Scanner;

public class SecondJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("請輸入底");
           float B = scn.nextFloat();
           System.out.println("請輸入高");
           float H = scn.nextFloat();
           float A = B*H/2;
           System.out.println("面積為"+A);
	}

}
