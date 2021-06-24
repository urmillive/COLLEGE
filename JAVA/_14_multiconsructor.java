class Bank
{
	double p,r,n;
	Bank()
	{
		this.p = 1000;
		this.r = 5;
		this.n = 1;
	}
	Bank(double p, double r, double n)
	{
		this.p = p;
		this.r = r;
		this.n = n;
	}
	Bank(double p)
	{
		this.p = p;
		this.r = 12;
		this.n = 4;
	}
	double si()
	{
		return p*r*n/100;
	}
}
class _14_multiconsructor
{
	public static void main(String[] args) {
		Bank b1 = new Bank();
		System.out.println("SI of b1 = "+b1.si());

		Bank b2 = new Bank(8000,12,4);
		System.out.println("SI of b2 = "+b2.si());

		Bank b3 = new Bank(5000);
		System.out.println("SI of b3 = "+b3.si());
	}
}

/*
SI of b1 = 50.0
SI of b2 = 3840.0
SI of b3 = 2400.0
*/