package practice;
import java.util.Scanner;
public class practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] a ={{70, 65},{90, 95}};
        int i=0,j=0;
        for(i=0;i<4;i++){
        for(j=i+1;j<4;j++){
    		if(a[i][j]>a[j][i]){
    			int v1=a[i][j];
    			a[i][j]=a[j][i];
    			a[j][i]=v1;
    	    }
        }
    		}
        for(i=0;i<4;i++){
        	System.out.println(a[i][j]);
	}
    	System.out.println("the min="+a[i=0]);
	}

}