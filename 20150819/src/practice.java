import java.util.Random;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran = new Random();
        int n =1000-ran.nextInt(1000);
        System.out.println(n);
fun(n);
	}
	public static int fun(int n1){
        if(n1>500){
        	System.out.println(n1/500+"��500��");
        	return fun(n1%500);
        }
        if(n1>100){
        	System.out.println(n1/100+"��100��");
        	return fun(n1%100);
        }
        if(n1>50){
        	System.out.println(n1/50+"��50��");
        	return fun(n1%50);
        }
        if(n1>10){
        	System.out.println(n1/10+"��10��");
        	return fun(n1%10);
        }
        if(n1>5){
        	System.out.println(n1/5+"��5��");
        	return fun(n1%5);
        }
        if(n1>1){
        	System.out.println(n1/1+"��1��");
        	return fun(n1%1);
        }
        return n1;
}
}