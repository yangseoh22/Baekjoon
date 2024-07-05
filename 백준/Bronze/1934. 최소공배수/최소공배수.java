import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();  //횟수
    	int[] lcms = new int[n];  //최소공배수 저장 배열
    	
    	for(int i=0; i<n; i++) {
    		int x = sc.nextInt();  //사용자에게 두 숫자 입력 받기
    		int y = sc.nextInt(); 
    		
    		int max = (x>y)? x : y ;
    		int min = (x<y)? x : y ;
    	
    		for(int j=max; j<=max*min; j+=max) {  //최소 공배수 구하기
    			if(j%x==0 && j%y==0) {
    				lcms[i] = j;
    				break;
    			}
    		}
    	}
    	
    	for(int l : lcms) {  //배열 모든 값 출력
        	System.out.println(l);
    	}

    }
}