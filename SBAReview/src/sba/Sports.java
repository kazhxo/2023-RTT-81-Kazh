package sba;

public interface Sports {
	
	//in interface there is no implementation, 
	// just method signatures
	//methods in interface can also return int, 
	//and methods may not require a parameter
	
	//by default is public because any class that implements it 
	//can see it
	void calculateAvgAge(int [] age);
	void retirePlayer(int id);
	

}
