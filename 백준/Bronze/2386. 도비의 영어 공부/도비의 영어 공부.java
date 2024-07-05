import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        
        while(true) {
            String a = sc.next();  // 알파벳 입력
            
            if (a.equals("#")) break;  // #을 입력했으면 종료
            
            String str = sc.nextLine();  // 문장 입력
            String[] arr = str.split("");  // 문장을 알파벳 기준으로 나누기
            int cnt=0;  // a와 겹치는 알파벳의 횟수
            
            for(int i=0; i<arr.length; i++) {
                // a와 문장 속 알파벳들을 비교. 대소문자 상관없으므로 다 소문자로 변환
                if(a.equals(arr[i].toLowerCase())) {
                	cnt++;  // 같은 알파벳 존재 시 변수 증가
                }
            }
            
            System.out.println(a+" "+cnt);
        }

    }
}