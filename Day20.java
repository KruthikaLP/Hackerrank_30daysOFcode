
import java.util.*;

public class Day20 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int temp=0;
            for(int i=1;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    int res= i&j;
                    if(res<k && res>temp)
                        temp=res;
                }
            }
            System.out.println(temp);
        }
    }
}
