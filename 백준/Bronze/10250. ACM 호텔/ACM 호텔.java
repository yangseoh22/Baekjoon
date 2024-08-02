import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());  //테스트 케이스 수

        //테스트 케이스 수만큼 반복
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());  //건물의 층
            int W = Integer.parseInt(st.nextToken());  //층별 호실 개수
            int N = Integer.parseInt(st.nextToken());  //손님의 순서

            int floor = 0; //손님에게 배정될 층
            int num = 0;   //손님에게 배정될 호실 번호

            if(N%H == 0){  //나누어 떨어지면 제일 위층
                floor = H;
                num = N/H;
            }
            else{
                floor = N%H;
                num = N/H + 1;
            }

            //방 번호 조합
            sb.append(floor);
            if(num<10){
                sb.append("0");
            }
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}
