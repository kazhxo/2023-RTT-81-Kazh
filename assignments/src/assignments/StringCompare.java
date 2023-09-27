package assignments;

public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    
    int indexOne= 0;
    int indexTwo=3;
    
    String[] subString= new String[s.length()-3+1];
    
    for(int i=0;i<s.length();i++){
     subString[i]=s.substring(indexOne,indexTwo);
       indexOne++;
       indexTwo++;
    
    System.out.println(subString[i]);
    }
    
    for(int i=0; i<s.length()-1; i++){
        if(subString[i].compareTo(subString[i++])>0){
            subString[i]=subString[i++];
            subString[i++]=subString[i];
        }
    }
    System.out.println(subString.toString());
    smallest=subString[0];
    largest=subString[s.length()-1];
    
    return smallest + "\n" + largest;
}
public class StringCompare {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));

	}

}
