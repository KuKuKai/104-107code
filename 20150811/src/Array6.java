import java.util.Scanner;
public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char[] data = str.toCharArray();
        int len = str.length();
        for(int i=0;i<len;i++){
        data[i]=(char)(data[i]+3);
        }
        String newStr=new String(data);
        System.out.println(newStr);
        System.out.println("¬O§_¸Ñ±K?(y/n)");
        String str1 =scn.nextLine();
        if(str1.equals("y")){
            for(int i=0;i<len;i++){
                data[i]=(char)(data[i]-3);
            }
            String newStr1=new String(data);
            System.out.println(newStr1);
        }
	}

}
