import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        	long a = sc.nextLong();
        	long b = sc.nextLong();
        	
        	long small = a<b ? a : b;
        	long gcd=1, lcm;
        	
        	for(long i = small; i>0; i--) {
        		if(a%i==0 && b%i==0) {
        			gcd = i;
        			break;
        		}
        	}
        	
        	lcm = a*b / gcd;
        	
        	System.out.println(lcm);
    }
}