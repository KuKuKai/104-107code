package practice;

public class practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;  
        while (i < 1000) {  
  
            boolean flag = true;  
            for (int j = 2; j < i / 2 + 1; j++) {  
                if (i % j == 0) {  
                    flag = false;  
                    break;  
                }  
  
            }  
            if (flag) {  
  
                System.out.println(i);  
            }  
            i++;  
        }
	}

}