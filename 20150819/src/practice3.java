import java.util.Scanner;
public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.print("請輸入一段字");
        String str = scn.nextLine();
        System.out.println(fac(str));
	}
public static String fac(String n){
	int n1= n.length();
	String str="";
	char z[]=n.toCharArray();
	for(int i=0;i<n1;i++){
		if(z[i]!=' '){
			str+=z[i];
		}
}
	return str;
}
}
