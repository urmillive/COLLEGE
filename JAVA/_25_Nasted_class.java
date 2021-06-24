class Outer
{
	int o = 10;
	void test()
	{
		Inner in = new Inner();
		in.disp();
	}
	class Inner
	{
		int i = 100;
		void disp()
		{
			System.out.println("Outer Class is = "+o);
		}
	}
	void showinner()
	{
		Inner in = new Inner();
		System.out.println("Inner = "+in.i);
	}
}
class _25_Nasted_class
{
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.test();
		ou.showinner();
	}
}

/*
Outer Class is = 10
Inner = 100
*/