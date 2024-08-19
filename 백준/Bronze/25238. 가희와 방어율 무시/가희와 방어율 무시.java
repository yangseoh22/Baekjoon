import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());  //방어율 수치
        int b = Integer.parseInt(st.nextToken());  //유저의 방무

        double tmp = a - (a*(b/100.0));  // 유저 체감 방어율 수치

        System.out.println(tmp>=100 ? 0 : 1);
    }
}