import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        //과목 개수 입력받고 그 크기의 배열 생성
        int n = s.nextInt();
        int[] score = new int[n];
        
        //성적 입력받기
        for(int i=0;i<n;i++) {
        	score[i]=s.nextInt();
        }
        
        //최고 성적 구하기
        int m = score[0];
        for(int i=1;i<n;i++) {
        	if(m<score[i]) m=score[i];
        }
        
        //새로운 평균 구하기
        float sum = 0;
        for(int i=0;i<n;i++) {
            sum += (float)score[i]/m*100;
        }
        float result = (float)sum/n;
        System.out.println(result);
    }
}