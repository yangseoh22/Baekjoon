import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  //수의 범위
        int m = Integer.parseInt(st.nextToken());  //수열의 길이

        int[] tmp = new int[m];  //탐색 내용을 저장
        backTraking(n, m, tmp, 0);

        System.out.println(sb);
    }
    public static void backTraking(int n, int m, int[] arr, int depth) {
        if(depth==m){
            for(int i = 0; i < m; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i=1; i<=n; i++){
            arr[depth] = i;
            backTraking(n, m, arr, depth+1);
        }
    }
}
