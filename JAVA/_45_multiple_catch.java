class _45_multiple_catch
{
	public static void main(String[] args) {
		int a=0,b;
		try
		{
			b = Integer.parseInt(args[0]);
			a = 10/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by Zero");
			a = 0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please Give atleast one Command Line arguments");
		}
	}
}

/*
Please Give atleast one Command Line arguments
*/