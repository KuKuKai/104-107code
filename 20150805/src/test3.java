import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
		System.out.println("請由小到大輸入三角形三邊長");
           Float a = scn.nextFloat();
           Float b = scn.nextFloat();
           Float c = scn.nextFloat();
           if(a+b>c && b-a<c){
        	   System.out.println("此為三角形");
           }else{
        	   System.out.println("此非三角形");
           }
	}

}
