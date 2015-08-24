import java.util.Scanner;
import java.util.Random;
public class SpecialTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        Random ran = new Random();
        int A=0,B=0;
        int[] data = new int[4];
        data = rndNum();
            int w =data[0];
            int x =data[1];
            int y =data[2];
            int z =data[3];
        System.out.println(w+""+x+""+y+""+z);
        System.out.println("請輸入4位數(數字不可重複)");
        int num=scn.nextInt();
        int a = num/1000%10;
        int b = num/100%10;
        int c = num/10%10;
        int d = num/1%10;
        System.out.println(a+""+b+""+c+""+d);
        if(w==a&&x==b&&y==c&&z==d){
        System.out.println("4A");
        }else{
            if(w==a&&x==b&&y==c||w==a&&y==c&&z==d||x==b&&y==c&&z==d){
            System.out.println("3A");
            }else{
                if(w==a&&x==b||w==a&&y==c||w==a&&z==d||x==b&&y==c||x==b&&z==d||y==c&z==d){
                    System.out.println("2A");
                    }else{
                        if(w==a||x==b||y==c||z==d){
                        System.out.println("1A");
                        }else{
                            System.out.println("0A");
                        }
                    }
            }
        }
        if(w==b||w==c||w==d&&x==a||x==c||x==d&&y==a||y==b||y==d&&z==a||z==b||z==c){
        	System.out.println("4B");
        }else{
        	if(w==b||w==c||w==d&&x==a||x==c||x==d&&y==a||y==b||y==d){
        		System.out.println("3B");
        	}else{
            	if(w==b||w==c||w==d&&y==a||y==b||y==d&&z==a||z==b||z==c){
            		System.out.println("3B");
            	}else{
                	if(x==a||x==c||x==d&&y==a||y==b||y==d&&z==a||z==b||z==c){
                		System.out.println("3B");
                	}else{
                		if(w==b||w==c||w==d&&x==a||x==c||x==d){
                			System.out.println("2B");
                		}else{
                    		if(w==b||w==c||w==d&&y==a||y==b||y==d){
                    			System.out.println("2B");
                    		}else{
                        		if(w==b||w==c||w==d&&z==a||z==b||z==c){
                        			System.out.println("2B");
                        		}else{
                            		if(x==a||x==c||x==d&&y==a||y==b||y==d){
                            			System.out.println("2B");
                            		}else{
                                		if(x==a||x==c||x==d&&z==a||z==b||z==c){
                                			System.out.println("2B");
                                		}else{
                                    		if(y==a||y==b||y==d&&z==a||z==b||z==c){
                                    			System.out.println("2B");
                                    		}else{
                                        		if(w==b||w==c||w==d||x==a||x==c||x==d||y==a||y==b||y==d||z==a||z==b||z==c){
                                        			System.out.println("1B");
                                        		}else{
                                        			System.out.println("0B");
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
	public static int[] rndNum(){
		int[] num = new int[4];
		for(int i=0; i<4 ; i++){
			num[i] = (int)(Math.random()*10);
			for(int j=0 ; j<i ; j++){
				if(num[i] == num[j]){
					i--;
					break;
				}
			}
		}
		return num;
	}

}
