import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Queue<Integer> q = new LinkedList<Integer>();  //정수형 큐 선언

        int n = Integer.parseInt(st.nextToken());  //사람 수
        int k = Integer.parseInt(st.nextToken());  //제거할 순서

        int idx = 0;  //제거할 순서의 인덱스

        //원에 앉아있는 사람들
        int[] circle = new int[n];
        for (int i = 0; i < n; i++) {
            circle[i] = i+1;
        }

        int remainder = n;
        for(int i = n; i>0; i--) {
            idx = (idx + (k-1)) % remainder;  //3주기
            q.add(circle[idx]);  //삭제한 사람은 큐에 넣기

            //삭제 후 재정렬
            for(int j = idx; j < n-1; j++){
                circle[j] = circle[j+1];
            }

            remainder--;  //한 명 삭제했으므로 감소
        }

        //큐의 모든 원소를 반환
        for(int i=0; i<n; i++) {
            if (i == 0) sb.append("<");

            if(!q.isEmpty()){
                int tmp = q.poll();
                sb.append(tmp);
            }

            if (i != n - 1) sb.append(", ");
            else sb.append(">");
        }

        System.out.println(sb.toString());
    }
}