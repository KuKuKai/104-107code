import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�X��ǥ�?");
        int stu =scn.nextInt();
        int n = 0,i=0;
        float max=0,min=999;
        float data[][]=new float[stu][4];
        String name[]=new String[stu];
        for(i=0;i<stu;i++){
        	System.out.println("��"+(i+1)+"��P�Ǫ��W�r");
        	name[i]= scn.next();
        	System.out.println("�п�J3�즨�Z");
        	data[i][0]=scn.nextFloat();
        	data[i][1]=scn.nextFloat();
        	data[i][2]=scn.nextFloat();
        	data[i][3]=(data[i][0]+data[i][1]+data[i][2])/3;
        }
        System.out.println("���Z������Ʀp�U:");
        for(i=0;i<stu;i++){
        	System.out.println(name[i]+data[i][3]);
        }
        System.out.println("���ή�H�Ƭ�:");
        for(i=0;i<stu;i++){
        	if(data[i][3]<60){
        	n++;
        	}
        }
    	System.out.println(n);
    	for(i=0;i<stu;i++){
    		if(data[i][3]<min){
    			min=data[i][3];
    		}
    		if(data[i][3]>max){
    			max=data[i][3];
    			}else{
    		}
    	}
    	System.out.println("�̰����Ƭ�:"+max);
    	System.out.println("�̧C���Ƭ�:"+min);
	}

}
