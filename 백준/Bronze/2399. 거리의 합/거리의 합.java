import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();  //점의 개수
        int[] tmp = new int[n];  //점의 위치 저장 배열
        
        for(int t=0;t<n;t++) {  //점의 위치 입력 받기
        	tmp[t]=s.nextInt();
        }
        
        long sum=0;  //거리의 합
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		sum+=Math.abs(tmp[i]-tmp[j]);
        	}
        }
        
        System.out.println(sum);
    }
}