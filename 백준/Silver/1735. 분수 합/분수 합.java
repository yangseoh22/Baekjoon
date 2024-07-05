import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        fractionSum(a,b,c,d);
        
    }
    
    //유클리드 호제법으로 최대공약수 계산
    static int gcd(int d, int n) {
    	if (n==0) return d;
    	return gcd(n, d%n);
    }
    
    static void fractionSum(int x1, int y1, int x2, int y2) {
    	
    	//두 분모의 최소공배수 계산 => 분모
    	int lcm = (y1*y2)/gcd(y1, y2);
    	
    	//위를 토대로 분자의 합 계산 => 분자
    	int num = x1*(lcm/y1)+x2*(lcm/y2);
    	
    	//기약분수 계산
    	//합 결과의 분모, 분자의 최대공약수 게산
    	int sum_gcd = gcd(lcm, num);
    	lcm = lcm/sum_gcd;
    	num = num/sum_gcd;
    	
    	System.out.println(num+" "+lcm);
    }
}