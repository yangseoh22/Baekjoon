import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();  //횟수
    	int[] lcms = new int[n];  //최소공배수 저장 배열
    	
    	for(int i=0; i<n; i++) {
    		int a = sc.nextInt();  //사용자에게 두 숫자 입력 받기
    		int b = sc.nextInt(); 
    		
    		int max = (a>b)? a : b ;
    	    int tmp = max;
    		while (true) {
                //두 수가 모두 나누어 떨어지는 경우
                if(max%a == 0 && max%b == 0) {
                    lcms[i] = max; //해당 수가 최소공배수
                    break;
                }
                max += tmp;  //max값 만큼 더해 배수 계산
            }
            
    	}
    	
    	for(int l : lcms) {  //배열 모든 값 출력
        	System.out.println(l);
    	}

    }
}