import java.util.Scanner;
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("請由小到大輸入邊長");
           Float a = scn.nextFloat();
           Float b = scn.nextFloat();
           Float c = scn.nextFloat();
           if(a*a+b*b == c*c){
           System.out.println("此為直角三角形");
	}else{
		if(a*a+b*b>c*c){
			System.out.println("此為銳角三角形");
		}else{
			System.out.println("此為鈍角三角形");
		}
	}
	}

}
