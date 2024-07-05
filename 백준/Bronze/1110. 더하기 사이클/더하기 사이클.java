import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  //사용자에게 n 입력 받기
        int a, b;  //a가 앞자리 수, b가 뒷자리 수

        int length=0;  //사이클의 길이
        int tmp = n;  //입력 받은 n을 저장해둠 
        
        do {     	
            a=n/10;  //10보다 작은 수일 경우 자동으로 0이 저장됨
            b=n%10;
            
            //이전의 일의자리 수와 두 자리수의 합 결과의 일의자리 수로 새로운 수를 생성
            n = b*10+(a+b)%10;
            
            length++;
        }while(tmp!=n);  //이전의 n과 새로운 n이 동일하면 사이클 완성
              
        System.out.println(length);
    }
}
