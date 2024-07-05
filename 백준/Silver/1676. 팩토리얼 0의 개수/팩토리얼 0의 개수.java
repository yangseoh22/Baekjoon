import java.util.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();  //사용자에게 n 입력받기
    	
    	BigInteger fact = BigInteger.ONE;
    	for(int i =1; i<=n; i++) {  //n팩토리얼 구하기
    		fact = fact.multiply(BigInteger.valueOf(i));
    	}

    	int cnt=0;  //0의 개수
        while (fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            fact = fact.divide(BigInteger.TEN);
            cnt++;
        }
    	
		System.out.println(cnt);
    }
}