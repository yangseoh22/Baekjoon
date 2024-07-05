import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean flag = true;
        

        for (int a=1;a<n;a++) {
            int sum=a;
            int num=a;
            while (num>=10) {         	
                int tmp=num%10;
                sum += tmp;
                num=num/10;
            }
            
            sum+=num;
            
            if(sum==n) {
                System.out.println(a);
                flag = false;
                break;
            }
        }
        if (flag)  System.out.println(0);

    }
}