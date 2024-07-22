import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 온도의 개수jfkjkjd
        int k = Integer.parseInt(st.nextToken());  // 며칠 간의 온도를 더할 것인지
        int[] temperature = new int[n];  // 온도 저장 배열
        int[] tmp = new int[n-k+1];

        st = new StringTokenizer(br.readLine());  // 온도 수열 입력 받기
        for(int i=0;i<n;i++){
            temperature[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n-k+1;i++){  // k일간의 온도의 합 저장
            for(int j = i; j<i+k; j++){
                tmp[i] += temperature[j];
            }
        }

        int max = tmp[0];
        for(int t : tmp) if (max < t) max = t;  // 최대 온도의 합 찾기

        System.out.println(max);
    }
}