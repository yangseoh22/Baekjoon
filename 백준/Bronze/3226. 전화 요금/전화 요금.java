import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();  // 통화 수
        int price = 0;  // 요금
        
        for(int i = 0; i < n; i++) {
            String start = s.next();  // 전화 건 시간
            int time = s.nextInt();  // 통화 시간
            
            String[] tmp = start.split(":");  // 시와 분을 나누어 저장
            int h = Integer.parseInt(tmp[0]);  // 정수로 변환 후 변수에 저장
            int m = Integer.parseInt(tmp[1]);
            
            // 시간과 분을 분 단위로 변환하여 계산
            int totalMinutes = h * 60 + m;
            int endMinutes = totalMinutes + time;
            
            // 요금 계산
            while (time > 0) {
                if (totalMinutes >= 7 * 60 && totalMinutes < 19 * 60) {
                    price += 10; // 7:00부터 19:00까지 1분당 10원
                } else {
                    price += 5;  // 그 외에는 1분당 5원
                }
                totalMinutes++;
                time--;
            }
        }
        System.out.println(price);
    }
}