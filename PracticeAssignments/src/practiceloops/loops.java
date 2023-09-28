package practiceloops;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		/*
		 * Write a program that uses nested for loops to print a multiplication table
		 */

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

		/*
		 * Write a program that prompts the user to enter two positive integers, and
		 * find their greatest common divisor (GCD).
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a positive integer ");
		int n1=scan.nextInt();
		System.out.println("Enter another positive integer ");
		int n2=scan.nextInt();
		
		if(n1>n2) {
	
		for(int i=1; i>n1; i++) {
			if(n1%i==0 && n2%i==0) {
				System.out.println("GCD is " + i);
				
			}}}else {
				for(int i=1; i>n2; i++) {
					if(n1%i==0 && n2%i==0) {
						
			}
					System.out.println("GCD is " + i);
				}
			}
	}

		

}
