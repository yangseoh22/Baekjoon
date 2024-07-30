import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());  //테스트 케이스 수

        for(int i = 0; i < t; i++) {
            String record = br.readLine();  //녹음된 소리

            StringTokenizer st = new StringTokenizer(record);  // 녹음된 소리를 단어별로 분리

            // 각 울음소리를 저장
            ArrayList<String> crying = new ArrayList<String>();
            while (st.hasMoreTokens()) {
                crying.add(st.nextToken());
            }

            while(true){
                String str = br.readLine();
                if (str.equals("what does the fox say?")) break;  // 종료 문장이면 종료
                else{
                    st = new StringTokenizer(str);
                    st.nextToken(); st.nextToken();  // <동물> goes

                    // 다른 동물의 울음소리와 같을 경우 연결리스트에서 삭제
                    String sound = st.nextToken();
                    crying.removeIf(c -> c.equals(sound));
                }
            }

            // 결과 출력
            for (String c : crying) {
                sb.append(c).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
