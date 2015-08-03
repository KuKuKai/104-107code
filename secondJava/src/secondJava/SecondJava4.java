package secondJava;

import java.util.Scanner;

public class SecondJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入半徑");
        final float pi = 3.1415926f;
        float r = scn.nextFloat();
        float a = r*r*pi;
        System.out.println("面積是"+a);
	}

}
