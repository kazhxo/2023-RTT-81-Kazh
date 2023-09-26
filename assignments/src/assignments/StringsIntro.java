package assignments;
import java.io.*;
import java.util.*;
public class StringsIntro {
	

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        System.out.println(A.length()+B.length());
	        if(A.compareTo(B)>0){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	        
	        String a= A.substring(0, 1).toUpperCase();
	        String restOfA= A.substring(1);
	        String b= B.substring(0, 1).toUpperCase();
	        String restOfB= B.substring(1);
	        
	        System.out.println(a + restOfA + " " +b + restOfB );
	        
	    
	        
	    }
}
