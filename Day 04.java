import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
          String a ="";
          String b = "";
          String s = sc.next();
          for(int i=0;i<s.length();i++){
              if(i%2==0){
                  a=a+s.charAt(i);
              }
              else{
                  b=b+s.charAt(i);
              }
          } 
            System.out.println(a+" "+b);
          n--;
        }
    }
}
