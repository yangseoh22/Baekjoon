import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	int n = sc.nextInt();
        	
        	if(n==-1) break;
        	
        	isPerfect(n);
        }
    }
    
    static void isPerfect(int n) {
    	int[] tmp = new int[n/2];  //약수를 저장할 배열
    	int cnt=0;  //인덱스
    	int sum = 0;  //약수들의 합
    	
    	for(int i = 1;i<n;i++) {
    		if (n%i==0) tmp[cnt++]=i;  //약수라면 저장
    	}
    	
    	for(int j=0; j<cnt; j++) {
    		sum += tmp[j];  //약수들의 합을 구함
    	}
    	
    	if (sum==n) {  //완전수라면
        	System.out.print(n + " = ");
    		for (int t=0; t<cnt-1; t++) {  //마지막 약수 빼고 출력
    			System.out.print(tmp[t]+" + ");
    		}
    		System.out.println(tmp[cnt-1]);  //마지막 약수 출력
    	}
    	else {  //완전수가 아니라면
    		System.out.println(n+" is NOT perfect.");
    	}
    	
    }
}