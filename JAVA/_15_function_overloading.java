class test
{
	void pro(double r)
	{
		System.out.println("Area of Circle = "+(3.14*r*r));
	}
	void pro(int l)
	{
		System.out.println("Area of Square = "+(l*l));
	}
	void pro(int l, int h)
	{
		System.out.println("Area of Rectangle = "+(l*h));
	}
}
class _15_function_overloading
{
	public static void main(String[] args) {
		test t = new test();
		t.pro(5.0);
		t.pro(10);
		t.pro(10,12);
	}
}

/*
Area of Circle = 78.5
Area of Square = 100
Area of Rectangle = 120
*/