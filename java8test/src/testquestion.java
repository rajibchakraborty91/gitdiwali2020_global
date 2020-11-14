import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class testquestion {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,a,b;
		
	
		
		  LocalDateTime date = LocalDateTime.of(2020, 3, 17, 23, 11);

      // print instance 
      System.out.println("LocalDate before"
                         + " subtracting days: " + date); 

      // subtract 17 days 
      LocalDateTime returnvalue 
          = date.minusDays(17); 

      // print result 
      System.out.println("LocalDate after "
                         + " subtracting days: " + returnvalue); 
	}

}
