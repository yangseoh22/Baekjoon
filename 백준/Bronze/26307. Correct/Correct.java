import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int HH = Integer.parseInt(st.nextToken());  //시
        int MM = Integer.parseInt(st.nextToken());  //분

        sb.append((HH - 9)*60+MM);

        System.out.println(sb);
    }
}