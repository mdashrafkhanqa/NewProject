package staticKeyword;

public class CallStatic {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//calling static method without creating object
		CheckStatic.test();
		
		//calling static method by creating object
		CheckStatic txt = new CheckStatic();
		txt.test();
		System.out.println(CheckStatic.color);		

	}


}
