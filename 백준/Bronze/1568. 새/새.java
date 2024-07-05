import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;
        int k = 1;
        
        while (n>0) {
        	if(k>n) {
        		k=1;
        		continue;
        	}
    		n = n - k;
    		cnt++;
    		k++;
        }
        
        System.out.println(cnt);
    }
}