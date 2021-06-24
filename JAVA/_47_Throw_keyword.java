class _47_Throw_keyword
{
	public static void main(String[] args) {
		System.out.println("Throwing Exception Explicitly");
		try
		{
			throw new ArithmeticException("Divide by Zero");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception "+ae);
		}
	}
}

/*
Throwing Exception Explicitly
Exception java.lang.ArithmeticException: Divide by Zero
*/