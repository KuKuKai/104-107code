import java.util.Scanner;
public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String con = scn.next();
        char c = con.charAt(0);
        String str = "";
        if (con.length() == 1){
        switch(c){
        case 'A':
        	str = "�x�_��"; break;
        case 'B':
        	str = "�x����"; break;
        case 'C':
        	str = "�򶩥�"; break;
        case 'D':
        	str = "�x�n��"; break;
        case 'E':
        	str = "������"; break;
        case 'F':
        	str = "�x�_��"; break;
        case 'G':
        	str = "�y����"; break;
        case 'H':
        	str = "��鿤"; break;
        case 'I':
        	str = "�Ÿq��"; break;
        case 'J':
        	str = "�s�˿�"; break;
        case 'K':
        	str = "�]�߿�"; break;
        case 'L':
        	str = "�x����"; break;
        case 'M':
        	str = "�n�뿤"; break;
        case 'N':
        	str = "���ƿ�"; break;
        case 'O':
        	str = "�s�˥�"; break;
        case 'P':
        	str = "���L��"; break;
        case 'Q':
        	str = "�Ÿq��"; break;
        case 'R':
        	str = "�x�n��"; break;
        case 'S':
        	str = "������"; break;
        case 'T':
        	str = "�̪F�u"; break;
        case 'U':
        	str = "�Ὤ��"; break;
        case 'V':
        	str = "�x�F��"; break;
        case 'W':
        	str = "����"; break;
        case 'X':
        	str = "���"; break;
        case 'Y':
        	str = "�����s"; break;
        case 'Z':
        	str = "����"; break;
        default:
        	System.out.println("no this place"); break;
        }
        System.out.println(str);
	}else{
		System.out.println("no this place");
	}
	}
        

}
