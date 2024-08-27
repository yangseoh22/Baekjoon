import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //DD:DD:DD 형식으로 입력 받아 ':'기준으로 나눠 저장
        String[] times = br.readLine().split(":");

        int[] num = new int[3];  //각 칸의 숫자를 저장
        num[0] = Integer.parseInt(times[0]);  //첫 번째 칸
        num[1] = Integer.parseInt(times[1]);  //두 번째 칸
        num[2] = Integer.parseInt(times[2]);  //세 번째 칸

        int isHour = 0;  //'시'가 될 수 있는 부분의 개수
        boolean error = false;  //형식에 맞지 않는 수가 입력되었는가?
        for(int i = 0; i < 3; i++) {
            if(num[i]>59) error = true;
            if(num[i]>=1 && num[i]<=12)  isHour++;
        }

        //error가 '참'일 경우 초기화
        if(error) isHour = 0;

        int cases = 0;  //시간을 볼 수 있는 경우의 수
        if(isHour==1) cases = 1*2*1;  //('시'의 경우의 수)*나머지의 경우의 수
        else if(isHour==2) cases = 2*2*1;  //('시'의 경우의 수)*나머지의 경우의 수
        else if(isHour==3) cases = 3*2*1;  //3개가 3가지로 위치되는 경우의 수
        else cases = 0;  //나머지는 0

        System.out.println(cases);
    }
}