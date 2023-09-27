package stringmethods;

public class StringBufferExample {

	public static void main(String[] args) {
		
		
		
		//on kba- reverse append
		//zyxcba
		
		
		String x= "abc";
		String y=x.toUpperCase();
		
		
		StringBuffer buffer= new StringBuffer();
		buffer.append("abc");
		buffer.append("xyz");
		System.out.println(buffer.toString());
		
		buffer.reverse();
		String sub= buffer.substring(0,3);
		
		buffer.insert(0,"123");
		System.out.println(buffer.toString());
		
		System.out.println("----------");
		
		//change x to be abc123xyz
		
		x=x.substring(0,3)+ "123" + x.substring(3);
		 
		//change x to abcxyz
		x=x.substring(0,3)+x.substring(6);
		
		//this is easier than substring
		
		buffer.delete(3,6);

		/*
		 * or z=z.substring(0,3)+ "123" + x.substring(3)
		 * String  z= "abcxyz";
		StringBuffer buff= new StringBuffer();
		buff.append("abc");
		buff.append("xyz");
		buff.insert(3,"123");
		System.out.println(buff.toString());
		 */
		

	}

}
