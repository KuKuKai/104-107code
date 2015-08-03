package secondJava;

import java.util.Scanner;

public class SecondJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn=new Scanner(System.in);
           System.out.println("Hello,請問您是?");
           String name = scn.next();
           System.out.println("Hi, "+name+"你好!");
           System.out.println(""+name+",很高興認識你，請問您是哪所高中比業的?");
           String school = scn.next();
           System.out.println(""+name+",原來你是"+school+"畢業的。");
           System.out.println("你現在讀哪一個系的?");
           String department = scn.next();
           System.out.println("哇~~ "+department+"可是熱門科系耶，你實在使太厲害了! :)");
           System.out.println("你畢業後要重是甚麼工作?");
           String work = scn.next();
           System.out.println(""+work+"是個不錯的工作，真是羨慕你!:)");
	}

}
