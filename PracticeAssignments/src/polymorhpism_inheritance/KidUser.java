package polymorhpism_inheritance;

public  class KidUser implements LibraryUser{

	int age;
	String bookType;
	
	public KidUser(int age, String bookType) {
		this.age=age;
		this.bookType=bookType;
	}

	public void registerAccount() {
		if(age<=11) {
			System.out.println("You have successfully regustered under a Kids account");
			
		}else {
			System.out.println("Sorry, age must be less than 12 to register as a kid.");
		}
	}
	
	public  void requestBook() {
		if(bookType.equals("Kids")) {
			System.out.println("“Book issued successfully please return the book within 10 days");
			
		}else {
			System.out.println("please return the book within 10 days");
		}
	}

}
