import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());  //케이스 개수
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(lcm(a, b)).append("\n");
        }

        System.out.println(sb);
    }
    //최소 공배수 구하기
    public static long lcm(int x, int y) {
        return ((long)x*y/gcd(x, y));
    }
    //최대 공약수 구하기
    public static int gcd(int x, int y) {
        while(y != 0){
            int tmp = y;
            y = x%y;
            x = tmp;
        }
        return x;
    }
}