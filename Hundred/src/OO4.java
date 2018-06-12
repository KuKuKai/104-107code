import java.util.Random;
public class OO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rnd = new Random();
        int[] data = new int[6];
        int i =0;
    	boolean flag=false;
    	while(i<6){
    	data[i]=rnd.nextInt(42)+1;
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
    	for( i=0;i<6;i++){
    	System.out.println(data[i]);
    	}
	}

}