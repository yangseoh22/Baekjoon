//chat gpt 참고
import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int[] scores = new int[8];
    	
    	//사용자에게 8개 점수 입력 받기
        for(int i=0; i<8; i++) {
        	scores[i] = sc.nextInt();
        }
        
        //점수와 문제 번호를 짝지어 저장할 리스트
        List<Score> scoreList = new ArrayList<>();
        for(int i=0; i<8; i++) {  //i+1은 문제 번호
        	scoreList.add(new Score(scores[i],i+1));
        }
        
        //점수를 내림차순 정렬 (b.score-a.score : score 기준 내림차순)
        Collections.sort(scoreList, (a,b) -> b.score-a.score);
       
        //상위 5개의 점수의 합을 계산하고, 문제 번호를 저장
        int sum = 0;
        List<Integer> qstNumbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sum += scoreList.get(i).score;
            qstNumbers.add(scoreList.get(i).number);
        }

        // 문제 번호를 오름차순으로 정렬
        Collections.sort(qstNumbers);
        
        // 결과 출력
        System.out.println(sum);
        for (int num : qstNumbers) {
            System.out.print(num + " ");
        }

    }
}

class Score{
	int score;
	int number;
	
	public Score (int score, int number){
		this.score = score;
		this.number = number;
	}
}