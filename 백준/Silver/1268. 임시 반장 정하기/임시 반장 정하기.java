import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 학생 수

        int[][] stud = new int[n][5]; // 학생들의 반을 저장할 표
        int[] total = new int[n];  // 학생 별 겹친 횟수 저장

        // 학생 별 반 정보 저장
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                stud[i][j] = sc.nextInt();
            }
        }

        // 겹쳤었는지 비교
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) continue;  // 자기 자신과는 비교하지 않음
                for(int k = 0; k < 5; k++) {
                    if(stud[i][k] == stud[j][k]) {  // i번 학생과 j번 학생이 k학년에 같은 반에 있었는지
                        total[i]++;
                        break;  // 한 학년에서 겹쳤으면 다른 학년은 더 볼 필요 없음
                    }
                }
            }
        }

        // 겹친 횟수가 가장 많은 학생 구하기
        int max = total[0];
        int idx = 0;  // 해당 학생의 번호
        for(int p = 1; p < n; p++) {
            if(total[p] > max) {
                max = total[p];
                idx = p;
            }
        }

        System.out.println(idx + 1);  // 학생 번호 출력 (1-based index)
    }
}