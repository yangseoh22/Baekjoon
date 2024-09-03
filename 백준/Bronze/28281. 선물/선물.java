import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int prev = Integer.parseInt(st.nextToken());  //전 날의 가격
        int now = 0;  //현재의 가격
        int min = Integer.MAX_VALUE;  //최소 가격

        // 가격을 입력 받음과 동시에 양말의 최소 가격 구하기
        for(int i = 0; i < N-1; i++) {
            now = Integer.parseInt(st.nextToken());

            int tmp = prev*X+now*X;
            if(min > tmp) min = tmp;

            prev = now;
        }

        System.out.println(min);
    }
}