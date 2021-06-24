class abc
{
	int a;
	void dis()
	{
		System.out.println("Super Class");
	}
}
class xyz extends abc
{
	int a;
	xyz(int p,int q)
	{
		a = p;
		super.a = q;
	}
	void show()
	{
		System.out.println("a of sub   = "+a);
		System.out.println("a of super = "+super.a);
	}
}
class _29_Super_var
{
	public static void main(String[] args) {
		xyz x = new xyz(10,20);
		x.show();
	}
}

/*
a of sub   = 10
a of super = 20
*/