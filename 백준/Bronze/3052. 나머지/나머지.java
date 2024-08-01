import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> remainders = new HashSet<>();
        
        // 10개의 숫자를 입력받고 각각 42로 나눈 나머지를 Set에 추가
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            int remainder = number % 42;
            remainders.add(remainder);
        }
        
        // 서로 다른 나머지의 개수를 출력
        System.out.println(remainders.size());
        
        scanner.close();
    }
}
