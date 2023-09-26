package assignments;
import java.io.*;
import java.util.*;


public class Reverse {
	import java.io.*;
	import java.util.*;


	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */         
	        String a="";
	        for(int i=A.length()-1;i>=0;i--){
	            a+=A.charAt(i);
	            
	        }
	        if(a.equals(A)){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	    }
	}





}
