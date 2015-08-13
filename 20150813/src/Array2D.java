import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("幾位學生?");
        int stu =scn.nextInt();
        int n = 0,i=0;
        float max=0,min=999;
        float data[][]=new float[stu][4];
        String name[]=new String[stu];
        for(i=0;i<stu;i++){
        	System.out.println("第"+(i+1)+"位同學的名字");
        	name[i]= scn.next();
        	System.out.println("請輸入3科成績");
        	data[i][0]=scn.nextFloat();
        	data[i][1]=scn.nextFloat();
        	data[i][2]=scn.nextFloat();
        	data[i][3]=(data[i][0]+data[i][1]+data[i][2])/3;
        }
        System.out.println("全班平均資料如下:");
        for(i=0;i<stu;i++){
        	System.out.println(name[i]+data[i][3]);
        }
        System.out.println("不及格人數為:");
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
    	System.out.println("最高分數為:"+max);
    	System.out.println("最低分數為:"+min);
	}

}
