import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] sit = new int[100];
		int x=0;
		
		//앉고 싶은 자리 번호(인덱스로 들어갈거라 -1)
		for(int i=0;i<n;i++) {
			int w = s.nextInt()-1;
			
			if(sit[w]==1) x++;  //이미 있으면 거절
			else sit[w]=1;  //없으면 그 자리를 앉음
		}

		System.out.println(x);
	}
}