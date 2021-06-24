class _44_DEscripion_of_exeption
{
	public static void main(String[] args) {
		int a,b;
		a = 123;
		try
		{
			b = a/0;
			System.out.println("B = "+b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception is "+ae);
			a = 0;
		}
		System.out.println("a = "+a);
	}
}

/*
Exception is java.lang.ArithmeticException: / by zero
a = 0
*/