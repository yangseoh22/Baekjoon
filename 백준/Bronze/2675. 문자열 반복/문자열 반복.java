import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());  // 케이스 개수

        for(int k = 0; k < t; k++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());  // 반복 횟수
            String word = st.nextToken();  // 단어

            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);  // 단어별로 순회

                for(int j = 0; j < r; j++) {  // 반복 횟수만큼 단어 추가
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
