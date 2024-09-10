import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        if (n == 2 || n == 3) {
            return true; 
        }
        if (n%2 == 0 || n%3 == 0) {
            return false; 
        }
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     
        
            for(int i=0;i<n;i++){
                int m = sc.nextInt();
                if(isPrime(m)){
                    System.out.println("Prime");
                }
                else{
                    System.out.println("Not prime");
                }
            }
        
        
        
    }
}
