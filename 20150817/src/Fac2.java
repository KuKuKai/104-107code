import java.util.Random;
public class Fac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran = new Random();
        int n =1000-ran.nextInt(1000);
        System.out.println(n);
        int v2=n/100;
            n=n%100;
        int v4=n/10;
            n=n%10;
        int v6=n/1;
        	System.out.println(v2+"¨Õ"+v4+"¬B"+v6+"¤¸");
	}

}
