import java.util.Random;
public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran = new Random();
        int n =1000-ran.nextInt(1000);
        System.out.println(n);
         fun(n);
	}
	public static int fun(int n){
		if(n>=100){
			System.out.print(n/100+"¨Õ");
			return fun(n%100);
		}
		if(n>=10){
			System.out.print(n/10+"¬B");
			return fun(n%10);
		}
		if(n>=1){
			System.out.print(n/1+"¤¸");
			return fun(n%1);
		}
		return n;
	}
}
