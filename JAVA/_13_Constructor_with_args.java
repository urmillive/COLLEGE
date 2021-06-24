class Bank
{
	double p,r,n;
	Bank(double p, double r, double n)
	{
		this.p = p;
		this.r = r;
		this.n = n;
	}
	double si()
	{
		return p*r*n/100;
	}
}
class _13_Constructor_with_args
{	
	public static void main(String[] args) {
		Bank b1 = new Bank(10000,10,5);
		System.out.println("SI = "+b1.si());
	}
}

/*
SI = 5000.0
*/