
public class constructor_java {

	public constructor_java() {
		// TODO Auto-generated constructor stub
		 System.out.println("public");
	}
	
	private constructor_java(float a) {
		// TODO Auto-generated constructor stub
		 System.out.println("private---float");
	}
	
	
	protected constructor_java(int a) {
		// TODO Auto-generated constructor stub
		 System.out.println("protected");
	}
	
	 constructor_java(double a) {
		// TODO Auto-generated constructor stub
		 
		 System.out.println("default--double");
	}
	
	
	
	public static void main(String[] args) {
		// new TODO Auto-generated method stub
		
		new constructor_java(4.0);
		new constructor_java(4.0f);
		new constructor_java((double)4.0);
		new constructor_java((float)4.0);

	}

}
