import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] mush = new int[10];  //버섯 저장 배열
        int sum = 0;  //합 변수
        int result=0;  //최종 결과
        
        for(int i=0;i<10;i++) {
        	mush[i]=s.nextInt();  //버섯 점수 입력 받기
        }
        
        for(int i=0;i<10;i++) {
        	sum += mush[i];
        	result = sum;
        	if (sum>=100) {
        		int a = sum-100;  //처음으로 100보다 큰 수와 100의 차
        		int b = 100-(sum-mush[i]);  //100보다 작은 가장 큰 수와 100의 차
        		
        		//차가 적은 수를 결과로
        		if(a<=b) result = sum;  //같을 경우도 포함
        		else result = sum-mush[i];
        		
        		break;
        	}
        }
       
        System.out.println(result);
    }
}