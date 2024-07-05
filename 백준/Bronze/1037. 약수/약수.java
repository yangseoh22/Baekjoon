import java.util.*;

public class Main {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int[] tmp = new int[50];
		 
		 for (int i=0;i<num;i++) {
			 tmp[i] = sc.nextInt();
		 }
		 
		 int min=tmp[0];
		 int max=tmp[0];
		 
		 for(int i=1;i<num;i++) {
			 if (tmp[i]>max) max=tmp[i];
			 if (tmp[i]<min) min=tmp[i];
		 }
		 
		 System.out.println(min*max);
	}

}
