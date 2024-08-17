
	import java.util.*;
	public class Day9{
	//a short and simple code with better understandability...
	    public static void main(String[] args) {
	        //object creation for memory allocation for variables...
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum=0,temp=0;
	    while(n!=0)
	    {
	
	        if(n%2==1)
	        { 
	          sum++;
	          temp = Math.max(sum,temp);
	        }
	        else sum=0;
		    // move to right bit
	        n=n/2;
		    
	    }
	  	  System.out.println(sum);
	 }
	}
