import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int sum=0;
    	
    	//사용자에게 두 수 입력 받기
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	
    	//수의 역순을 구하는 함수 rev()호출
    	String resx= rev(x);
    	String resy= rev(y);

    	//문자열로 전달 받았기에 정수형으로 변환
    	int xnum = Integer.parseInt(resx);
    	int ynum = Integer.parseInt(resy);
    	sum = xnum+ynum;
    	
    	int result = Integer.parseInt(rev(sum));
    	
    	//역수들의 합을 다시 역순으로 출력
        System.out.println(result);
    }
    
    //역순으로 수를 바꿔 반환하는 함수
    public static String rev(int a) {
    	String reserve = "";
    	
    	while(a>=10) {  //일의 자리수부터 마지막 자릿수 까지 저장
    		reserve += a%10;
    		a=a/10;
    	}
    	reserve += a;
    	
    	return reserve;  //역순으로 바꾼 결과 출력
    }
}