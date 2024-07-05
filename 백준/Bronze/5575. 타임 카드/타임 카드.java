import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int[] a = new int[6];
    	int[] b = new int[6];
    	int[] c = new int[6];
    	
    	for(int i=0;i<6;i++) {
    		a[i]=sc.nextInt();
    	}
    	for(int i=0;i<6;i++) {
    		b[i]=sc.nextInt();
    	}
    	for(int i=0;i<6;i++) {
    		c[i]=sc.nextInt();
    	}
    	
    	timeCal(a);
    	timeCal(b);
    	timeCal(c);
    }
    
    static void timeCal(int[] t) {
    	int start = t[0]*60*60 + t[1]*60 + t[2];
    	int end =  t[3]*60*60 + t[4]*60 + t[5];
    	
    	int job = end - start;
    	
    	int h = job/3600;
    	int m = (job%3600)/60;
    	int s = (job%360)%60;
    	System.out.println(h+" "+m+" "+s);
    }
}