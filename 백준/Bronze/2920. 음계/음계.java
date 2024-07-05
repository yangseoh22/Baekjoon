import java.util.*;

public class Main {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 int[] music = new int[8];
		 
		 for(int i=0;i<8;i++) {
			 music[i] = sc.nextInt();
			 //문자열로 입력받은 후 첫번쩨 문자 저장			 
		 }
		 
		 if (music[0]==1) {
			 for(int i=1;i<8;i++) {
				 if (music[i]!=i+1) {
					 System.out.println("mixed");
					 return;
				 }
			 }
			 System.out.println("ascending");
		 }
		 else if(music[0]==8) {
			 int n = 7;
			 for(int i=1;i<8;i++) {
				 if (music[i]!=n--) {
					 System.out.println("mixed");
					 return;
				 }
			 }
			 System.out.println("descending");
		 }
		 else System.out.println("mixed");
	}

}
