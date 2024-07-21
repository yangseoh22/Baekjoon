import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 단어 입력 받기
        String word = br.readLine();

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);  //단어별로 순회

            //아스키 코드값을 이용
            //소문자는 97~, 대문자는 65~ 이므로 32 차이남
            if(ch >= 'a' && ch <= 'z') {
                ch -= 32;
                sb.append(ch);
            }
            else if(ch >= 'A' && ch <= 'Z') {
                ch += 32;
                sb.append(ch);
            }
        }

        System.out.println(sb);

    }
}
