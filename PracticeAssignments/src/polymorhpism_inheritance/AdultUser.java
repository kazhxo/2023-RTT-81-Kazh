package polymorhpism_inheritance;

public  class  AdultUser implements LibraryUser {
	
	int age;
	String bookType;
	

	public AdultUser(int age, String bookType) {
		this.age=age;
		this.bookType=bookType;
	}
	

	public void registerAccount() {
		if(age>=11) {
			System.out.println("You have successfully\r\n"
					+ "registered under an Adult Account.”");
			
		}else {
			System.out.println("Sorry, age must be greater than 12 to register as an adult.");
		}
	}
	
	public  void requestBook() {
		if(bookType.equals("Fiction")) {
			System.out.println("“Book issued successfully please return the book within 7 days");
			
		}else if(bookType!=("Fiction")){
			System.out.println("Oops, you are allowed to take only adult Fiction\r\n"
					+ "books");
		}
	}

	

}
