class _27_variable_args
{
	public static void test(String ...args)
	{
		System.out.println("Argumnets = "+args.length);
		for(String s:args)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		test("Hi","Hello");
		test("one","Two","Three");
	}
}

/*
Argumnets = 2
Hi
Hello
Argumnets = 3
one
Two
Three
*/