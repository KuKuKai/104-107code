package secondJava;

import java.util.Scanner;

public class SecondJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("�п�J�W��");
           float U = scn.nextFloat();
           System.out.println("�п�J�U��");
           float D = scn.nextFloat();
           System.out.println("�п�J��");
           float H = scn.nextFloat();
           float A = (U+D)*H/2;
           System.out.println("���n�O"+A);
	}

}
