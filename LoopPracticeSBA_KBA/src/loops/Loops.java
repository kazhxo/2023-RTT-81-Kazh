package loops;

public class Loops {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;

		}
		System.out.println(sum);

		int sum2 = 0;
		for (int i = 0; i <= 100; i++) {
			sum2 += (i % 2);
		}
		System.out.println(sum2);
	

		int sum3=0;
		for(int i = 0;i<=100;i++){
		if(i%2==0) {
			sum3+=i;
	
			
		}
}
		System.out.println(sum3);
		
		int number=10;
		while(number>0) {
			number-=1;
			System.out.println(number);
		}
		}
	}
