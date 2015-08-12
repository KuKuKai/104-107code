import java.util.Scanner;
import java.util.Random;
public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int[] data = new int[5];
        int[] data1 = new int[5];
        int i=0,j=0,k=0;
        System.out.println("請輸入五個不重複的數字:");
        for(k=0;k<5;k++){
        	data1[k]=scn.nextInt();
        }
        for(k=0;k<5;k++){
        for(j=k+1;j<5;j++){
    		if(data1[k]>data1[j]){
    			int v1=data1[k];
    			data1[k]=data1[j];
    			data1[j]=v1;
    	    }
        }
    		}
        System.out.println("中位數為:"+data1[2]);
        
    	for(i=0;i<5;i++){
        	data[i]=rnd.nextInt(100)+1;
        	for(int l=0;l<i;l++){
        		if(data[i]==data[l]){
        			i--;
        		}
        	}
        }
        for(i=0;i<5;i++){
        for(j=i+1;j<5;j++){
    		if(data[i]>data[j]){
    			int v1=data[i];
    			data[i]=data[j];
    			data[j]=v1;
    	    }
        }
        System.out.println(data[i]);
    		}
        System.out.println("中位數為:"+data[2]);
        
        if(data1[2]>data[2]){
        System.out.println("You Win!");
	}else{
		if(data1[2]<data[2]){
			System.out.println("You Lose!");
		}else{
			System.out.println("Draw!");
		}
		}
	}

}
