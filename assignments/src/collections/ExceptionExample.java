package collections;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		ExceptionExamples ee=new ExceptionExamples();
		
		ee.readNumber();

		
	}
		public void readNumber() throws Exception {
			Scanner scanner = new Scanner(System.in);

			try {
				System.out.println("Please enter a number:");
				int x = scanner.nextInt();
				
				//this code only executes if theres no exception
				System.out.println("You entered the number " + x);
			} catch (Exception e) {
				
				//executes only if exection occurs
				System.out.println("You did not enter a number");
				System.out.println("The error message is " + e.getMessage());
			}finally {
				//optional
				//executes no matter what 
				System.out.println("This executes no matter what");
			}
		}

	}
