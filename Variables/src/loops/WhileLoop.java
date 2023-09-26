package loops;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		
		Random random= new Random(100);
		
		Scanner scan= new Scanner(System.in);
		int number=0;
		while(number!=100) {
		System.out.println("Guess the number");
		
		number= scan.nextInt();
		
		if(number>100) {
			System.out.println("Try again that is too high");
		}else if(number<100) {
			System.out.println("Try again that is too low");
		}else {
			System.out.println("You got it!");
		}
		
		
	}
		}

}
