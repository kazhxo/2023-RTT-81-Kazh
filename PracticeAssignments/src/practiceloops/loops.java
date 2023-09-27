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
		int a=scan.nextInt();
		System.out.println("Enter another positive integer ");
		int b=scan.nextInt();
		
		if(a>b) {
			for(int i=0; i<=b;i++) {
				if(a%i==0 && b%i==0) {
					System.out.println("The GCD is " + i);
					break;
				}
			}}else if(b>a) {
					for(int i=0; i<=a;i++) {
						if(a%i==0 && b%i==0) {
							System.out.println("The GCD is " + i);
							
				
			}
		}
		System.out.println();
		
		
		
			}
	}
}
