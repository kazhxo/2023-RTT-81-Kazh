
package stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("135");

		System.out.println(sb);
		//means replace index 0 to index 4 with the " "
		sb.replace(0, 5, "6789");
		System.out.println(sb);
		
		//inserts text at index 0 at the beginning
		sb.insert(2, "12345");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 5);

		System.out.println(sb.toString());

	}

}
