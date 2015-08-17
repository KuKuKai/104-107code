import java.util.Scanner;
public class Fac4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入2數(x,y)");
        int x =scn.nextInt();
        int y =scn.nextInt();
        System.out.print("最大公約數為:"+gcd(x,y));
	}
public static int gcd(int x,int y){
if(y==0){
	return x;
}else{
	return gcd(y,x%y);
}
}
}
