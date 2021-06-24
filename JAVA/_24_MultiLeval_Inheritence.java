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
class C extends B
{
	void si()
	{
		System.out.println("SI = "+(p*r* n/100));
	}
}
class _24_MultiLeval_Inheritence
{
	public static void main(String[] args) {
		C c = new C();
		c.set_val(1000,10,2);
		c.si();
	}
}

/*
SI = 200.0
*/