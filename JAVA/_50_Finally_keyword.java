class _50_Finally_keyword
{
	static void method1()
	{
		try
		{
			System.out.println("method1()");
			throw new ArithmeticException();
		}
		finally
		{
			System.out.println("finally of method1");
		}
	}
	static void method2()
	{
		try
		{
			System.out.println("method2()");
			return;
		}
		finally
		{
			System.out.println("finally of method2");
		}
	}
	public static void main(String[] args) {
		try
		{
			method1();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception");
		}
		method2();
		try
		{
			System.out.println("Normal Stetment");
		}
		catch(Exception e)
		{
			System.out.println("Exception is "+e);
		}
		finally
		{
			System.out.println("finally of main method");
		}
	}
}

/*
method1()
finally of method1
Arithmetic Exception
method2()
finally of method2
Normal Stetment
finally of main method
*/