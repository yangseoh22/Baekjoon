import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        
        // 하루에 실제 올라가는 거리
        int dayMove = a - b;
        
        // 마지막 날은 미끄러지지 않으므로 미리 빼줌
        int days = (v - a) / dayMove + 1;
        
        // 정상에 도달하기 전 남은 거리가 있다면 하루 더 필요
        if ((v - a) % dayMove != 0) {
            days++;
        }

        System.out.println(days);
    }
}
