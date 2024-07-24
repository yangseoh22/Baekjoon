import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 문자열 받기
        String input = scanner.nextLine().trim();
        
        // 입력 문자열이 공백으로만 이루어진 경우 단어 개수는 0
        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            // 문자열을 공백을 기준으로 분리
            String[] words = input.split("\\s+");
            // 단어의 개수 출력
            System.out.println(words.length);
        }
        
        scanner.close();
    }
}
