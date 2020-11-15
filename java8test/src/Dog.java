

	
	
	class Dog extends animal
	{
		 Dog()
			{
			 super();
				System.out.println("child Dog");
			}
			

			void eat()
			{
				System.out.println("child eat");
			}
			

			void work()
			{
				super.eat();
				System.out.println("child work");
			}
	}
	

