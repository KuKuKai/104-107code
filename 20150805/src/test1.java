import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int d = scn.nextInt();
           int w = scn.nextInt();
           if(d == 07 || d == 17 || d == 27 && d>0 && d<=31){
        	   System.out.println("不吃素");
           }else{
        	   if(w == 2 || w == 4 || w == 6 && w>0 && w<=7){
        		   System.out.println("吃素");
        	   }else{
        		   System.out.println("不吃素");
        	   }
           }
	}

}
