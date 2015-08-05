import java.util.Scanner;
public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("½Ð¿é¤J¦¨ÁZ:");
           Float a = scn.nextFloat();
           if(a>97){
        	   System.out.println("A+");
           }else{
        	   if(a>93){
            	   System.out.println("A");
               }else{
            	   if(a>89){
                	   System.out.println("A-");
                   }else{
                	   if(a>86){
                    	   System.out.println("B+");
                       }else{
                    	   if(a>83){
                        	   System.out.println("B");
                           }else{
                        	   if(a>79){
                            	   System.out.println("B-");
                               }else{
                            	   if(a>76){
                                	   System.out.println("C+");
                                   }else{
                                	   if(a>73){
                                    	   System.out.println("C");
                                       }else{
                                    	   if(a>69){
                                        	   System.out.println("C-");
                                           }else{
                                        	   if(a>66){
                                            	   System.out.println("D+");
                                               }else{
                                            	   if(a>63){
                                                	   System.out.println("D");
                                                   }else{
                                                	   if(a>=60){
                                                    	   System.out.println("D-");
                                                       }else{
                                                    	   if(a>=0){
                                                    		   System.out.println("E");
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

}
