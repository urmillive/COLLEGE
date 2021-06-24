class A
{
	final void disp()
	{
		System.out.println("Hello of Class A");
	}
}
class B extends A
{
	// void disp()
	// {
	// 	System.out.println("Hello of Class B");
	// }
}
class _19_final_like_constant
{
	public static void main(String[] args) {
		B b = new B();
		b.disp();
	}
}

/*
Hello of Class A
*/