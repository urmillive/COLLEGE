class Banking
{
	double p,r,n;
	void si()
	{
		double si = p*r*n/100;
		System.out.println("SI = "+si);
	}
}
class _10_user_define_function
{
	public static void main(String[] args) {
		Banking b1 = new Banking();
		b1.p = 5000;
		b1.r = 12;
		b1.n = 5;
		b1.si();

		Banking b2 = new Banking();
		b2.p = 1000;
		b2.r = 10;
		b2.n = 5;
		b2.si();
	}
}

/*
SI = 3000.0
SI = 500.0
*/