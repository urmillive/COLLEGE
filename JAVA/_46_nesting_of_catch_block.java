class _46_nesting_of_catch_block
{
	public static void main(String[] args) {
		int a=0,b;
		try
		{
			a = 10 / args.length;
			System.out.println("a = "+a);
			try
			{
				b = Integer.parseInt(args[1]);
				a = 12/0;
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("Array index out of bound");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero");
		}
	}
}

/*
Divide by Zero
*/