import java.util.Random;
public class Fac1зя {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran = new Random();
        int n =1000-ran.nextInt(1000);
        System.out.println(n);
        int n1[]={500,100,50,10,5,1};
        int n2[]=new int[6];
        for(int i=0;i<n1.length;i++){
        	n2[i]=n/n1[i];
        	n=n%n1[i];
        	if(n2[i]>0){
        		System.out.println(n2[i]+"н╙"+n1[i]);
        	}
        }
	}

}
