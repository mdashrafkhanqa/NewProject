package session3Assignment;

public class Program2 extends Program2Two{
	
public void child() {
		
		System.out.println("This is Child Class");
		
	}

	public static void main(String[] args) {
		
		Program2 obj = new Program2();
		
		//Calling Grand Parent Class Method
		obj.grandfather(); 
		
		//Calling Parent Class Method
		obj.father();
		
		//Calling Local Method in Child Class
		obj.child();

	}


}
