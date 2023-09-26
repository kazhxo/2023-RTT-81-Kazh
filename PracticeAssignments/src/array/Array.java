package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int n1= readPositiveNumber(scanner);
		int n2= readPositiveNumber(scanner);
		
		System.out.println("First number : " + n1);
		System.out.println("Second number : " + n2);
	}
	public static int readPositiveNumber(Scanner scanner){
		int number= -1;
	
		while(number<=0) {
			System.out.println("Enter a positive integer greater than 0 : ");
			number= scanner.nextInt();
			
			if(number<=0) {
				System.out.println("Error: must be a positive number");
			}
		}
		
		return number;
		
	}}
