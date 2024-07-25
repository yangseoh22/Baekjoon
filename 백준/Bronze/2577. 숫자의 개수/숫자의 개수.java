import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //세 정수 입력 받기
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        //세 정수를 곱하기
        int mul  = a*b*c;
        String str = Integer.toString(mul);

        int[] tmp = new int[10]; //0~9가 몇번 쓰였는지 저장

        //문자열 순회해 아스키코드-'0'하면 해당 숫자
        for(int i = 0; i < str.length(); i++){
            tmp[str.charAt(i)-'0']++;
        }

        for(int i=0; i<10; i++){
            if(i==9) sb.append(tmp[i]);
            else sb.append(tmp[i]).append("\n");
        }

        System.out.println(sb);

    }
}
