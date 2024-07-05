import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] bsk= new int[n];
        int tmp;
        for(int i=0;i<n;i++){
            bsk[i]=i+1;
        }
        
        for(int j=0;j<m;j++){
            int x = s.nextInt();
            int y = s.nextInt();
            tmp=bsk[x-1];
            bsk[x-1]=bsk[y-1];
            bsk[y-1]=tmp;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(bsk[i]+" ");
        }
    }
}