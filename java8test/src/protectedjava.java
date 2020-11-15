
public class protectedjava {
	
	 protected  int count;
	
	void display()
	{
		count= 5;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
	
	
		
		protectedjava pj  = new protectedjava();
		
		pj.display();
		pj = new mysample();
		pj.display();
		
		
	
	}

}

class mysample extends protectedjava
{
	void display()
	{
		System.out.println(count);
	}
}
