import java.util.Scanner;
import java.util.Random;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int[] data = new int[20];
        int a=0,v1=0,v2=0;
        for(int i=0;i<20;i++){
        	data[i]=rnd.nextInt(21)-10;
        	if(data[i]<0){
        		v1++;
        	}else{
        		if(data[i]>0){
        			v2++;
        		}else{
        			a++;
        		}
        	}
        }
        for(int i=0;i<20;i++){
        	System.out.println(data[i]);
        }
        System.out.println(v1+"�ӭt��");
        System.out.println(a+"��0");
        System.out.println(v2+"�ӥ���");
	}

}
