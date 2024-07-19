import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력을 끝까지 받기 위해 hasNextLine()을 사용
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(input);
        }

        scanner.close();
    }
}
