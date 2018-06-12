import java.util.Scanner;
public class seventh02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] data = {30,20,10,5,34};
        int [] data1 =new int[5];
        for(int i=0;i<5;i++){
        	data1 [i]=data[5-i-1]; 
        }
        for(int i=0;i<5;i++){
        System.out.print(data1[i]+"\t");
        }
	}

}