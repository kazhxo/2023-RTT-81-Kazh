package practice303_7_1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

		/*
		 * Task 1 Write a program that creates an array of integers with a length of 3.
		 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		 */
		int[] array1 = { 1, 2, 3 };

		for (int elements : array1) {
			System.out.println(elements);
		}

		System.out.println("--------------------------");
		int[] array2 = { 13, 5, 7, 68, 2 };

		/*
		 * Task 2 Write a program that returns the middle element in an array. Give the
		 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
		 * following output: 7
		 */

		int middle = array2.length / 2;
		
		System.out.println(array2[middle]);

		System.out.println("--------------------------");

		/*
		 * Task 9: Write a program to sort the following int array in ascending order:
		 * {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the
		 * smallest and the largest element of the array. The output will look like the
		 * following: Array in ascending order: 0, 1, 2, 4, 9, 13 The smallest number is
		 * 0 The biggest number is 13
		 */
		int[] unsortedArray = { 4, 2, 9, 13, 1, 0 };
		for (int i = 0; i < unsortedArray.length; i--) {

		}

		/*
		 * Task8 Write a program that creates a String array of 5 elements and swaps the
		 * first element with the middle element without creating a new array.
		 * 
		 */
		
		String[] strings= {"1","2","3","4","5"};
		Arrays.toString(strings);
		
		String temp= strings[0];
		strings[0]= strings[2];
		strings[2]=temp;
		System.out.println(Arrays.toString(strings));
		strings[2]=temp;
		System.out.println(Arrays.toString(strings));
		
		

		/*
		 * Task10 Create an array that includes an integer, 3 strings, and 1 double.
		 * Print the array.
		 * 
		 */

		Object[] objectArray = new Object[5];
		objectArray[0] = Integer.valueOf(4);
		objectArray[1] = "String 1";
		objectArray[2] = "String 2";
		objectArray[3] = "String 3";
		objectArray[4] = 1.0;

		/*
		 * Task 11: Write some Java code that asks the user how many favorite things
		 * they have. Based on their answer, you should create a String array of the
		 * correct size. Then ask the user to enter the things and store them in the
		 * array you created. Finally, print out the contents of the array.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("How many favorite things? ");
		int numFavorites = scan.nextInt();
		scan.nextLine();

		String[] favorites = new String[numFavorites];

		for (int pos = 0; pos < numFavorites; pos++) {
			System.out.println("Enter favorite thing " + pos);
			favorites[pos] = scan.nextLine();
		}
		System.out.println(Arrays.toString(favorites));

	}

}
