import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());  //자릿수
        String k = br.readLine();  //자연수

        int even = 0;  //짝수 개수
        int odd = 0;  //홀수 개수
        for(int i = 0; i < k.length(); i++) {
            //자릿수 별 문자를 구하기
            String digit = Character.toString(k.charAt(i));
            int num = Integer.valueOf(digit);

            //홀수, 짝수를 판별
            if(num%2==0) even++;
            else odd++;
        }

        if(even > odd) sb.append(0);  //짝짝수
        else if(odd > even) sb.append(1);  //홀홀수
        else sb.append(-1);  //둘 다 아님

        System.out.println(sb);
    }
}