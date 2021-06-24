class Print
{
	static void print()
	{
		System.out.println("Hello");
	}
}
class _17_static
{
	static int a = 10;
	static int b = 0;
	static void dis(int c)
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
	static
	{
		System.out.println("This is Static Block");
	}
	public static void main(String[] args) {
		dis(30);
		Print.print();
	}
}

/*
This is Static Block
a = 10
b = 0
c = 30
Hello
*/