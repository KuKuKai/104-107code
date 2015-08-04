import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("請輸入A:");
           Float A = scn.nextFloat();
           System.out.println("請輸入B:");
           Float B = scn.nextFloat();
           System.out.println("你要做的運算是+,-,*或/?");
           String str = scn.next();
           if(str.equals("+")){
        	 System.out.println(""+(A+B)+"="+A+"+"+B+"");
           }else{
        	   if(str.equals("*")){
        		  System.out.println(""+(A*B)+"="+A+"*"+B+"");
        	   }else{
        		   if(str.equals("-")){
        			   System.out.println(""+(A-B)+"="+A+"-"+B+"");
        		   }else{
        			   System.out.println(""+(A/B)+"="+A+"/"+B+"");
        		   }
        	   }
        	 
           }
           
        		   }

}
