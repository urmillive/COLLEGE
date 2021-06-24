class _48_Exeption_origin_throw
{
	static void mymethod()
	{
		try
		{
			throw new ClassCastException();
		}
		catch(ClassCastException ce)
		{
			System.out.println("Exeption is = "+ce);
		}
	}
	public static void main(String[] args) {
		System.out.println("Throwing Exception Explicitly");
		try
		{
			mymethod();
		}
		catch(ClassCastException ce)
		{
			System.out.println("Again Cougth "+ce);
		}
	}
}

/*
Throwing Exception Explicitly
Exeption is = java.lang.ClassCastException
*/