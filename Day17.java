import java.util.*;
public class day17 {
    public static void main(String[] args) {
        int i=4;
        double d=4.0;
        String s="HackerRank";
        //variable declaration and object creation
        //done in the same line...
      Scanner sc = new Scanner(System.in);
        int i2=sc.nextInt();
        double d2=sc.nextDouble();
        String s2=sc.next()+sc.nextLine();
        // addition and concatination along with
        //printing the output. done in same line
        System.out.println((i+i2)+"\n"+(d+d2)+"\n"+s.concat(s2));
    }
//shorted and cleaner code provides better readability and
//better understanding...
}
