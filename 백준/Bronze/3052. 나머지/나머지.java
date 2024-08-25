import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //숫자 10개 입력
        int[] nums = new int[10];
        for(int i = 0; i < 10; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        //각 수를 42로 나누었을 때의 나머지 기록
        int[] remain = new int[43];  //나올 수 있는 나머지는 0~42이므로 크기를 42로 설정
        int cnt = 0;  //서로 다른 나머지의 개수
        for(int i = 0; i < 10; i++) {
            int tmp = nums[i]%42;

            if (remain[tmp] == 0) {cnt++;}  //처음 나오는 나머지이면 카운트
            remain[tmp]++;  //해당 나머지의 베열 원소 증가
        }

        System.out.println(cnt);
    }
}