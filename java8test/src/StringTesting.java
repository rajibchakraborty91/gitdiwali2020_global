import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.jcp.xml.dsig.internal.dom.DOMPGPData;


 class StringTesting {		
	
	static int ax=40;
	
	static {
		System.out.println("static block");
	}
	
	static
	{
		
	}
	static 
	{
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=50;
		System.out.println(b);
			// = new animal();
			 animal a = new Dog();
			
			a.work();			a.eat();


}
}



 class animal
{
	 
	 animal()
	{
		System.out.println("super animal");
	}
	 
	 static class animalinner
	 {
		 void eat()
		 {
			 System.out.println("eat inner class");
		 }
	 }
	

	  void eat()
	{
		System.out.println("super eat");
	}
	

	void work()
	{
		System.out.println("super work");
	}
	



	
	
	
}