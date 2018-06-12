public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] rnd = new int [3];
        for(int i=0;i<3;i++){
        	rnd[i]=(int)(Math.random()*100+1);
        	System.out.println(rnd[i]);
        }
        	int min = rnd[0];
        	int max = rnd[0];
        	for(int i : rnd){
        		if(i<min){
        			min=i;
        		}
        	if(i>max){
        		max=i;
        	}
	}
        		System.out.println("�̤p�Ȭ�:"+min);
        		System.out.println("�̤j�Ȭ�:"+max);
	}

}