import java.util.Random;
public class Array11зя {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rnd = new Random();
        int[] data = new int[3];
        int i=0,j=0;
    	for(i=0;i<3;i++){
        	data[i]=rnd.nextInt(100)+1;
        	for(int l=0;l<i;l++){
        		if(data[i]==data[l]){
        			i--;
        		}
        	}
        }
        for(i=0;i<3;i++){
        for(j=i+1;j<3;j++){
    		if(data[i]>data[j]){
    			int v1=data[i];
    			data[i]=data[j];
    			data[j]=v1;
    	    }
        }
    		}
        for(i=0;i<3;i++){
        	System.out.println(data[i]);
	}
    	System.out.println("the max="+data[i=2]);
    	System.out.println("the min="+data[i=0]);
	}

}
