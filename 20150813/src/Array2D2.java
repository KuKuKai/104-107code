import java.util.Scanner;
public class Array2D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入r*s*t矩陣");
		int p=0,q=0;
		int r = scn.nextInt();
		int s = scn.nextInt();
		int t = scn.nextInt();
		int[][] m =new int[r][s];
		int[][] o =new int[s][t];
		int[][] n =new int[r][t];
		System.out.println("請輸入4碼");
        for(int i = 0;i<r;i++){
            for(int j = 0; j<s;j++){
                m[i][j]=scn.nextInt();
            }
        }
		System.out.println("請輸入4碼");
        for(int j = 0;j<s;j++){
                for(int k = 0;k<t;k++){
                    o[j][k]=scn.nextInt();
                }
        }
        for(int i = 0;i<r;i++){
            for(int k = 0;k<s;k++){
                for(int j = 0;j<t;j++){
                	n[p][q]+=m[i][j]*o[j][k];
            }q++;
        }p++;q=0;
        }
        System.out.println("m:");
        for (int i = 0;i<r; i++) {
            for (int j = 0; j <s; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("o:");
        for (int j = 0; j<s; j++) {
            for (int k = 0; k <t; k++) {
                System.out.print(o[j][k] + "\t");
            }
            System.out.println();
        }
        System.out.println("n=m*o:");
        for (int i = 0;i<r; i++) {
            for (int k = 0; k <t; k++) {
                System.out.print(n[i][k] + "\t");
            }
            System.out.println();
        }
	}

}
