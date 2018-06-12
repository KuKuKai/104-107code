package practice;
import java.util.Scanner;
public class practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] a = {70, 65, 90, 85, 95};
        int i=0,j=0;
        for(i=0;i<5;i++){
        for(j=i+1;j<5;j++){
    		if(a[i]>a[j]){
    			int v1=a[i];
    			a[i]=a[j];
    			a[j]=v1;
    	    }
        }
    		}
        for(i=0;i<5;i++){
        	System.out.println(a[i]);
	}
    	System.out.println("the max="+a[i=4]);
    	System.out.println("the min="+a[i=0]);
    	System.out.println("�t�Ȭ�:"+(a[i=4]-a[i=0]));
	}

}