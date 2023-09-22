package variables;

public class java_basics {
	public static void main(String[] args) {

		/*
		 * Write a program that declares two integer variables, assigns an integer to
		 * each, and adds them together. Assign the sum to a variable. Print out the
		 * result.
		 */

		int a = 2;
		int b = 3;

		int ab = a + b;

		System.out.println(a + " + " + b + " equals " + ab);

		/*
		 * Write a program that declares two double variables, assigns a number to each,
		 * and adds them together. Assign the sum to a variable. Print out the result.
		 */

		double c = 2.34;
		double d = 4.12;

		double cd = c + d;

		System.out.println(c + " + " + d + " equals " + cd);

		/*
		 * Write a program that declares an integer variable and a double variable,
		 * assigns numbers to each, and adds them together. Assign the sum to a
		 * variable. Print out the result. What variable type must the sum be?
		 */

		int e = 5;
		double f = 2.5;

		double ef = e + f;

		System.out.println(e + " + " + f + " equals " + ef);

		/*
		 * Write a program that declares two integer variables, assigns an integer to
		 * each, and divides the larger number by the smaller number. Assign the result
		 * to a variable. Print out the result. Now change the larger number to a
		 * decimal. What happens? What corrections are needed?
		 * 
		 */

		int g = 10;
		int h = 6;

		int gh = g / h;

		System.out.println(g + " / " + h + " equals " + gh);

		double i = g;

		System.out.println(i + " / " + h + " equals " + i / h);

		/*
		 * Write a program that declares two double variables, assigns a number to each,
		 * and divides the larger by the smaller number. Assign the result to a
		 * variable. Print out the result. Now, cast the result to an integer. Print out
		 * the result again.
		 */

		double j = 2.32;
		double k = 1.6;

		double jk = j / k;

		System.out.println(j + " / " + k + " equals " + jk);

		System.out.println(g + " / " + h + " equals " + (int) gh);

		/*
		 * Write a program that declares two integer variables, x and y, and assigns the
		 * number 5 to x and the number 6 to y. Declare a variable q and assign y/x to
		 * it and print q. Now, cast y to a double and assign it to q. Print q again.
		 * 
		 */

		int x = 5;
		int y = 6;
		int q = y / x;

		double z = (double) y;

		System.out.println(y + " / " + x + " equals " + z / x);

		/*
		 * Write a program that declares a named constant and uses it in a calculation.
		 * Print the result.
		 */

		int constant = 2;
		double calculation = constant / 1;

		System.out.println(calculation);

		





		

	}

}
