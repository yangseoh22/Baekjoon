import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int cnt = 0;  //말의 개수
        
        //보드 생성 후 입력 받기
        char[][] board = new char[8][8];
        for (int r=0;r<8;r++) {
            String input = s.next();
            for (int c = 0; c < 8; c++) {
                board[r][c] = input.charAt(c);
            }
        }
        
        //보드는 흰색과 검정색이 체크로 되어있고, (0,0)은 흰색
        //0포함 짝수 행은 0, 2, 4, 6이 흰색
        //홀수 행은 1, 3, 5, 7이 흰색
        for (int r=0;r<8;r++) {
        	if(r%2==0) {  //짝수 행
                for (int c=0;c<8;c+=2) {
                	if(board[r][c]=='F') cnt++;
                }
        	}
        	else {  //홀수 행
                for (int c=1;c<8;c+=2) {
                	if(board[r][c]=='F') cnt++;
                }
        	}
        }
        
        System.out.println(cnt);
    }
}
