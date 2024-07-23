import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        sb.append(a+b-c).append("\n");

        String str = String.valueOf(a) + String.valueOf(b);
        int ab = Integer.parseInt(str);
        sb.append(ab-c);

        System.out.println(sb);

    }
}
