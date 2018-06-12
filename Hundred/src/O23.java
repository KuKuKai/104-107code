import java.util.Random;
public class O23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rnd = new Random();
        int [] a =new int[3];
    	for(int i=0;i<3;i++){
    	a[i]=rnd.nextInt(100)+1;
    	System.out.println(a[i]);
    	}        
    	int min = a[0];
        int max = a[0];
    	for(int j:a){
    		if(j<min){
    			min = j;
    		}if(j>max){
    			max = j;
    		}
    	}System.out.println("�̤p�Ȭ�:"+min);
		System.out.println("�̤j�Ȭ�:"+max);
	}

}