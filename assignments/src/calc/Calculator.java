package calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
				Calculator c = new Calculator();
				
				
				Scanner scan= new Scanner(System.in);
				System.out.println("Enter a number");
				int a=scan.nextInt();
				System.out.println("Enter another number");
				int b=scan.nextInt();
				scan.nextLine();
				
				c.menu();
				System.out.println("What do you want to do? ");
				
				String choice= scan.nextLine();
				if(choice.equalsIgnoreCase("add")) {
					System.out.println(add(a,b));
				}else if(choice.equalsIgnoreCase("subtract")) {
					System.out.println(subtract(a,b));
				}else if(choice.equalsIgnoreCase("multiply")) {
					System.out.println(multiply(a,b));
				}if(choice.equalsIgnoreCase("divide")) {
					System.out.println(divide(a,b));
				}
			}
			
			public void menu() {
				System.out.println("Add");
				System.out.println("Subtract");
				System.out.println("Multiply");
				System.out.println("Divide");

			}

			public static double add(double num, double num2){
				return num+num2; 
			}

			public static double subtract(double num, double num2){
				return num-num2; 
			}
			public static double multiply(double num, double num2){
				return num*num2; 
			}
			public static double divide(double num, double num2){
				return num/num2; 
			}
			

		}



