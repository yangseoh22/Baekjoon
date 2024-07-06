import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] tmp = new int[n-m+1];  // 소수를 저장
        int idx = 0;  // 배열 인덱스 저장

        // m부터 n까지의 수 중에 소수 찾기
        // 소수는 자신과 1로만 나누어 떨어짐
        for(int i=m; i<=n; i++){
            if(i < 2) continue;
            boolean flag = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    flag = false;  // 소수가 아님
                    break;
                }
            }
            if(flag){  // 소수인 경우 배열에 저장
                tmp[idx++] = i;
            }
        }

        if (idx == 0) {  // 소수가 없는 경우
            System.out.println(-1);
            return;
        }

        int sum = 0;  // 찾은 소수들의 합
        for(int i=0;i<idx;i++){
            sum += tmp[i];
        }

        // 소수들의 합과 최소 소수 출력
        // 최소 소수는 소수를 구할 때 작은 수 부터 찾았으므로 배열의 첫 값임
        System.out.println(sum+"\n"+tmp[0]);

    }
}