import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());  //테스트 개수

        for(int i = 0; i < n; i++) {
            String s = br.readLine();  //문제 결과를 입력

            sb.append(countPoint(s)).append("\n");  //점수 계산
        }

        System.out.println(sb);
    }

    public static int countPoint(String s){
        int point = 1;  //'O'일 경우 올라갈 점수
        int sum = 0;  //총 점수

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  //문자별로 확인
            if(c == 'O') {
                sum += point++;  //합계에 더하고 point 증가
            }
            else if(c == 'X') {
                point = 1;  //다시 point를 1로 초기화
            }
        }

        return sum;
    }
}
