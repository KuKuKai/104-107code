import java.util.Scanner;
import java.util.Random;

public class NewSpecialTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int A = 0, B = 0;
		int[] data = new int[4];
		int[] user = new int[4];
		data = rndNum();
		int w = data[0];
		int x = data[1];
		int y = data[2];
		int z = data[3];
		System.out.println("�п�J4�ӼƦr(�Ʀr���i����)");
		while (A < 4) {
			A = 0;
			B = 0;
			boolean tt = false;
			do {
				tt=false;
				int num = scn.nextInt();
				String str = num + "";
				int len = str.length();
				if (len == 4) {
					user[0] = num / 1000 % 10;
					user[1] = num / 100 % 10;
					user[2] = num / 10 % 10;
					user[3] = num / 1 % 10;
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < i; j++) {
							if (user[i] == user[j]) {
								System.out.println("��J���~�A�ЦA�դ@��!");
								tt = true;
								break;
							}
						}
						if(tt)break;
					}
					if (tt == false) {
						for (int i = 0; i < 4; i++) {
							if (user[i] == data[i]) {
								A++;
							}
							for (int j = 0; j < 4; j++) {
								if (data[i] == user[j]) {
									B++;
								}
							}
						}
						B = B - A;
						System.out.println(A + "A" + B + "B");
						if (A == 4) {
							System.out.println("�AĹ��!");
						} else {
							System.out.println("�|������A���~��q!");
						}
					}
				} else {
					System.out.println("��J���~�A�ЦA�դ@��!");
				}
			} while (tt);
		}
	}

	public static int[] rndNum() {
		int[] num = new int[4];
		for (int i = 0; i < 4; i++) {
			num[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		return num;
	}

}
