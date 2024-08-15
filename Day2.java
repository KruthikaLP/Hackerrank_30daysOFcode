
import java.util.*;
public class Day2 {
    public static void main(String[] args){
        //creating an object "sc" to call it later
        //this saves time
        Scanner sc=new Scanner(System.in);
        //allocating memory space using the object "sc"
        double mealCost = sc.nextDouble();
        int tipPercent = sc.nextInt();
        int taxPercent = sc.nextInt();
        //net cost calculation done in single line saves time
        //and helps to make the code look clear and short
        double tip = mealCost*tipPercent/100;
        double tax =mealCost*taxPercent/100;
        double netCost =mealCost+tip+tax;
        
        System.out.println((int) Math.round(netCost));
    }
}
