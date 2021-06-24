class TestClass
{
	void testMethod() throws ClassNotFoundException
	{
		throw new ClassNotFoundException("Class not Found");
	}
}
class _49_Throws_Keyword
{
	public static void main(String[] args) {
		TestClass t = new TestClass();
		try
		{
			System.out.println("Calling Test Method");
			t.testMethod();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Exception is "+e);
		}
	}
}

/*
Calling Test Method
Exception is java.lang.ClassNotFoundException: Class not Found
*/