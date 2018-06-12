import java.util.Scanner;
public class O17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("�п�J(x,y,z)");
        int x =scn.nextInt();
        int y =scn.nextInt();
        int z =scn.nextInt();
        System.out.print("�̤p�����Ƭ�:"+lcm(x,y,z));
	}
public static int gcd(int x,int y,int z){
if(y==0){
	return x;
}
	if(z==0){
		return gcd(y,x%y,0);
	}else{
		return gcd(x,z,y%z);
	}
}
public static int lcm(int x,int y,int z){
	int a=x*y/gcd(x,y,0);
return a*z/gcd(a,z,0);
	}

}