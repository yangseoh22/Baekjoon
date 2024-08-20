import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());  //수의 개수

        int[] arr = new int[n];
        for(int i=0;i<n;i++){  //수열 입력
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);  //오름차순 정렬

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}