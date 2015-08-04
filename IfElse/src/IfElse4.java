import java.util.Scanner;
public class IfElse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("´X¤ë?");
           int A = scn.nextInt();
           System.out.println("´X¸¹?");
           int B = scn.nextInt();
           if((A == 1 && B <= 20 && B > 0 ) || ( A == 12 && B >= 21 && B <= 31)){
        	   System.out.println("¼¯½~®y");
           }else{
        	   if((A == 2 && B <= 20 && B > 0 ) || ( A == 1 && B >= 21 && B <= 31)){
            	   System.out.println("¤ô²~®y");
           }else{
            	   if((A == 3 && B <= 20 && B > 0) || ( A == 2 && B >= 21 && B <= 29 )){
                	   System.out.println("Âù³½®y");
           }else{
                	   if((A == 4 && B <= 20 && B > 0 ) || ( A == 3 && B >= 21 && B <= 31)){
                    	   System.out.println("¨d¦Ï®y");
           }else{
                    	   if((A <= 5 && B <= 20 && B > 0 ) || ( A == 4 && B >= 21 && B <= 30)){
                        	   System.out.println("ª÷¤û®y");
           }else{
                        	   if((A <= 6 && B <= 20 && B > 0 ) || ( A == 5 && B >= 21 && B <= 31)){
                            	   System.out.println("Âù¤l®y");
           }else{
                            	   if((A <= 7 && B <= 20 && B > 0 ) || ( A == 6 && B >= 21 && B <= 30)){
                                	   System.out.println("¥¨ÃÉ®y");
           }else{
                                	   if((A <= 8 && B <= 20 && B > 0 ) || ( A == 7 && B >= 21 && B <= 31)){
                                    	   System.out.println("·à¤l®y");
           }else{
                                    	   if((A <= 9 && B <= 20 && B > 0 ) || ( A == 8 && B >= 21 && B <= 31)){
                                        	   System.out.println("³B¤k®y");
           }else{
                                        	   if((A <= 10 && B <= 20 && B > 0 ) || ( A == 9 && B >= 21 && B <= 30)){
                                            	   System.out.println("¤Ñ¯¯®y");
           }else{
                                            	   if((A <= 11 && B <= 20 && B > 0 ) || ( A == 10 && B >= 21 && B <= 31)){
                                                	   System.out.println("¤ÑÃÈ®y");
           }else{
                                                	   if((A <= 12 && B <= 20 && B > 0 ) || ( A == 11 && B >= 21 && B <= 30)){
                                                    	   System.out.println("®g¤â®y");
           }else{
           }
           }
           }
}
}
           }
           }
           }
           }
           }
           }
           }
	}
}