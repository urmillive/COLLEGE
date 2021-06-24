class Banking
{
	double p,r;
	int n;
}
class _09_Object_of_class
{
	public static void main(String[] args) {
		double si;
		
		Banking b1 = new Banking();
		b1.p = 5000;
		b1.r = 12;
		b1.n = 5;
		si = b1.p*b1.r*b1.n/100;
		System.out.println("SI = "+si);

		Banking b2 = new Banking();
		b2.p = 1000;
		b2.r = 10;
		b2.n = 5;
		si = b2.p*b2.r*b2.n/100;
		System.out.println("SI = "+si);
	}
}

/*
SI = 3000.0
SI = 500.0
*/