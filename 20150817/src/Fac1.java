import java.util.Random;
public class Fac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran = new Random();
        int n =1000-ran.nextInt(1000);
        System.out.println(n);
        int v1=n/500;
            n=n%500;
            if(v1!=0){
            	System.out.println(v1+"��500��");
            }
        int v2=n/100;
            n=n%100;
            if(v2!=0){
            	System.out.println(v2+"��100��");
            }
        int v3=n/50;
            n=n%50;
            if(v3!=0){
            	System.out.println(v3+"��50��");
            }
        int v4=n/10;
            n=n%10;
            if(v4!=0){
            	System.out.println(v4+"��10��");
            }
        int v5=n/5;
            n=n%5;
            if(v5!=0){
            	System.out.println(v5+"��5��");
            }
        int v6=n/1;
        if(v6!=0){
        	System.out.println(v6+"��1��");
        }

	}

}
