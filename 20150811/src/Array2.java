
import java.util.Random;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rnd = new Random();
        int[] data = new int[10];
        int i=0;
    	boolean flag=false;
        	while(i<10){
        	data[i]=rnd.nextInt(100);
        	flag=false;
        	for(int l=0;l<i;l++){
        		if(data[i]==data[l]){
        			flag=true;
        		}
        	}
        		if(flag==false){
        			i++;
        	}
        	}
        	for( i=0;i<10;i++){
        	System.out.println(data[i]);
        	}
        }
	}

