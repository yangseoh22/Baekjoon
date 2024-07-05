import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long sum = 0;

        if(a > b){
            sum = a*(a+1)/2 -  b*(b+1)/2 + b;
        }
        else{
            sum = b*(b+1)/2 -  a*(a+1)/2 + a;
        }

        System.out.println(sum);
    }
}