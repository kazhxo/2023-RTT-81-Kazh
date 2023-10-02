package polymorhpism_inheritance;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		KidUser kid= new KidUser(10,"Kids");
		KidUser kid2= new KidUser(18,"Fiction");
		kid.registerAccount();
		kid.requestBook();
		kid2.registerAccount();
		kid2.requestBook();
		
		
		
		AdultUser adult= new AdultUser(5,"Kids");
		AdultUser adult2= new AdultUser(23,"Fiction");
		adult.registerAccount();
		adult.requestBook();
		adult2.registerAccount();
		adult2.requestBook();
	}

}
