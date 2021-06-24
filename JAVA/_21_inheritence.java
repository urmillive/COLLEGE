class Superclass
{
	int a,b;
	void dis_super()
	{
		System.out.println("Display of Super Class");
		System.out.println("a = "+a+" b = "+b);
	}
}
class Subclass extends Superclass
{
	int c,d;
	void dis_sub()
	{
		System.out.println("Display of Sub Class");
		System.out.println("a = "+a+" b = "+b);
		System.out.println("c = "+c+" d = "+d);
	}
}
class _21_inheritence
{
	public static void main(String[] args) {
		Subclass s = new Subclass();
		s.a = 10;
		s.b = 20;
		s.c = 30;
		s.d = 40;
		s.dis_super();
		s.dis_sub();
	}
}

/*
Display of Super Class
a = 10 b = 20
Display of Sub Class
a = 10 b = 20
c = 30 d = 40
*/