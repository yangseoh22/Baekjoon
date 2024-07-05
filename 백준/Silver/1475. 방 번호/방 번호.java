import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();  //사용자에게 n 입력받기
    	int[] tmp = {0,0,0,0,0,0,0,0,0,0};  //크기 10의 배열
    	int cnt = 0;  //필요한 세트 개수
    	
    	//자릿수별로 나눠서 해당 인덱스의 수를 증가시킴
    	while(n>=10) {
    		int x = n%10;
    		n = n/10;
    		
    		tmp[x]++;
    	}
    	tmp[n]++;
    	
    	//6, 9제외의 경우 최대값 찾기
    	cnt = tmp[0];
    	for(int i=0;i<=9;i++) {
    		if(i==6||i==9) continue;
    		else {
    			if(cnt<tmp[i])
    			cnt = tmp[i];
    		}
    	}
    	
    	//6, 9인 경우
    	int s = tmp[6]+tmp[9];
    	if (s%2==0) s = s/2;  //짝수는 2로 나눈 몫
    	else s = s/2+1;  //홀수는 2로 나눈 몫+1
    	
    	cnt = (s>cnt)?s:cnt;
    	
		System.out.println(cnt);
    }
}