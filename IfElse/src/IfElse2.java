import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("�п�JA:");
           Float A = scn.nextFloat();
           System.out.println("�п�JB:");
           Float B = scn.nextFloat();
           System.out.println("�A�n�����B��O+,-,*��/?");
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
