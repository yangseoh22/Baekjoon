import javax.xml.stream.events.EndDocument;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  //바구니 수
        int M = Integer.parseInt(st.nextToken());  //순서 변경 횟수
        int[] arr = new int[N];

        //배열 초기화
        for(int i = 0; i < N; i++){
            arr[i] = i+1;
        }

        //범위 속 배열을 역순으로 바꾸기
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            //역순으로 바꿀 범위 입력
            int start = Integer.parseInt(st.nextToken())-1;  //인덱스에 접근 쉽게 1을 빼줌
            int end = Integer.parseInt(st.nextToken())-1;

            //양끝을 맞바꾸기
            int change = end;  //현재 위치와 바꿀 위치
            for(int j=start; j<=end; j++){
                if(j>=change) break;
                int tmp = arr[j];
                arr[j] = arr[change];
                arr[change] = tmp;
                change--;
            }
        }

        //출력
        for(int i = 0; i < N; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
