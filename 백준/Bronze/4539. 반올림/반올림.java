import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();  //케이스 개수
    	int[] nums = new int[n];  //케이스 저장 배열
	
    	for (int i=0;i<n;i++) {  //모든 케이스를 입력 받음
    		nums[i]=sc.nextInt();
    	}
    	
    	for (int i=0;i<n;i++) {  //배열 순회하며 반올림 함수 호출
    		System.out.println(cal(nums[i]));
    	}
    }
    
    //반올림 계산 함수
    private static int cal(int num) {
    	int idx = 0;
    	int[] tmp = new int[8];
    	
    	while(num>=10) {
    		int a = num%10;  //최하위 자리수
    		num=num/10;  //나머지 부분
    		
    		if(a>=5) {  //다음 자리 수 반올림      		
        		tmp[idx++]=0;
        		num++;  //num에 1을 더해주면 다음 자리 수가 반올림된 것
    		}
    		else {  //버림
        		tmp[idx++]=0;
    		}
    	}
    	
    	double digit = Math.pow(10,idx);  //자릿수
    	double result = num*digit;  //반올림 결과
    	return (int)result;
    }
}