import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int idx = 0;
    	int[] tmp = new int[8];
    	
    	while(n>=10) {
    		int a = n%10;  //최하위 자리수
    		n=n/10;  //나머지 부분
    		
    		if(a>=5) {  //다음 자리 수 반올림      		
        		tmp[idx++]=0;
        		n++;  //n에 1을 더해주면 다음 자리 수가 반올림된 것
    		}
    		else {  //버림
        		tmp[idx++]=0;
    		}
    	}
    	
    	double digit = Math.pow(10,idx);  //자릿수
    	double result = n*digit;  //최종 결과
    	
    	System.out.println((int)result);
    }
}