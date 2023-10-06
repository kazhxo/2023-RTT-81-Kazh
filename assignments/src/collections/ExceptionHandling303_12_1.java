package collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling303_12_1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	     
        
		  
	       try {
	      int x = scan.nextInt();
	      int y = scan.nextInt();
	      System.out.println(x / y);
	    } catch(ArithmeticException | InputMismatchException e) {
	      if (e instanceof ArithmeticException) {
	        System.out.println("java.lang.ArithmeticException: / by zero");
	      } else if (e instanceof InputMismatchException){
	        System.out.println("java.util.InputMismatchException");
	      }
	    }
	

	}

}
