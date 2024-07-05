//chatGPT의 코드
import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();

        // 2007년의 각 월의 일 수를 저장한 배열
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // 2007년 1월 1일부터 입력 받은 날짜까지의 일 수 계산
        int days = day-1;  //월요일 인덱스가 0이므로 1일 일 때, 0이 나오게 1을 빼줌
        for (int i = 0; i < month - 1; i++) {  //month 달의 일 수에 전 달까지의 일 수를 합해 계산
            days += daysInMonth[i];
        }

        // 2007년 1월 1일이 월요일이므로, days를 7로 나눈 나머지를 인덱스로 이용하여 요일 계산
        int dayOfWeek = (days+1) % 7;  

        String[] weekDays = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        System.out.println(weekDays[dayOfWeek]);
    }
}