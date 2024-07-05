import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num;
        int count=0;
        boolean flag  = true;
        
        for(int i=0;i<n;i++){
        	flag = true;
        	
        	num = s.nextInt();

            if(num==1) continue;
            
            for (int j=2;j<=num/2;j++) {
                if(num%j==0) {
                	flag=false;
                	break;
                }
            }
            if (flag) count++;

        }     
    	

        System.out.println(count);
    }
}
