import java.util.Random;
public class Fac2§ï {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran = new Random();
        int n =1000-ran.nextInt(1000);
        System.out.println(n);
        fac(n);
	}
        public static void fac(int n){
        int n1[]={100,10,1};
        String n3[]={"¨Õ","¬B","¤¸"};
        int n2[]=new int[3];
        for(int i=0;i<n1.length;i++){
        	n2[i]=n/n1[i];
        	n=n%n1[i];
        	if(n2[i]>0){
        		System.out.print(n2[i]+n3[i]);
        	}
}
}
}