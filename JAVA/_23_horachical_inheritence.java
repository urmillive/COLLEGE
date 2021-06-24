class A
{
	static double p,r,n;
}
class B extends A
{
	void set_val(double p, double r, double n)
	{
		this.p = p;
		this.r = r;
		this.n = n;
	}
}
class C extends A
{
	void si()
	{
		System.out.println("SI = "+(p*r* n/100));
	}
}
class _23_horachical_inheritence
{
	public static void main(String[] args) {
		B b = new B();
		b.set_val(1000,10,2);
		C c = new C();
		c.si();
	}
}

/*
SI = 200.0
*/