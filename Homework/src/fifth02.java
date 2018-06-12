import java.util.Scanner;
public class fifth02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("��J��Ʀra,b");
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a>b){
        	System.out.println("a>b");
        }
        if(a<b){
        	System.out.println("b>a");
        }
        System.out.println("�п�J+,-,*,/");
        String sign = scn.next();
        switch(sign){
        case "+":
        	System.out.println(a+b);break;
        case "-":
        	System.out.println(a-b);break;
        case "*":
        	System.out.println(a*b);break;
        case "/":
        System.out.println(a/b);break;
        }
	}

}