import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           String s = scn.next();
           String d = scn.next();
           int p = scn.nextInt();
           if(s.equals("五十嵐")){
        	   System.out.println("不買");
           }else{
        	   if(d.equals("綠茶") || d.equals("咖啡") && p <= 45 && p >= 0){
        		   System.out.println("買");
        	   }else{
        			   System.out.println("不買");
        	   }
           }
	}

}
