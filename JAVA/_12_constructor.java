class Bank
{
	double p,r,n;
	Bank()
	{
		p = 100;
		r = 15;
		n = 5;
	}
	double si()
	{
		return p*r*n/100;
	}
}
class _12_constructor
{	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		System.out.println("SI = "+b1.si());
	}
}

/*
SI = 75.0
*/