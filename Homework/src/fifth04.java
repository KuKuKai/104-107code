import java.util.Scanner;
public class fifth04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�п�J�ʧO:�k/�k");
        String str = scn.next();
        System.out.println("�п�J����");
        int t = scn.nextInt();
        switch(str){
        case "�k":
            System.out.println((t-80)*0.7+"Kg���з��魫");
            break;
        case "�k":
        	System.out.println((t-70)*0.6+"Kg���з��魫");
        	break;
        default:
        		System.out.println("�L���ʧO");
        }
	}

}