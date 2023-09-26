package arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int arraySize = 10;

		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";

		for (int position = 0; position < arraySize; position++) {
			System.out.println("The value in positon " + position + " is " + stringArray[position]);
		}
		System.out.println();
		
		for(String value: stringArray) {
			System.out.println("The value = " + value );
		}
		
		/*
		 * write a for loop that counts number of nulls in the array
		 * after the loop completes print that number
		 */
		
		int nullCount=0;
		for(String value : stringArray) {
			if(value==null) {
				nullCount+=1;
			}
		}
		System.out.println("Number of nulls is " + nullCount);
		
		//write for loop that tells location of the first null
		
		int firstNull=-1;
		for(int pos=0; pos<stringArray.length;pos++) {
			if(stringArray[pos]==null) {
				firstNull=pos;
				break;
			}
		}
		System.out.println("Positoin of first null " + firstNull);
		
		
		
		//write for loop sou
	}

}
