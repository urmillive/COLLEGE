class Base
{
	String msg;
	Base(String msg)
	{
		this.msg = msg;
	}
	void dis()
	{
		System.out.println("Method of Super Class");
		System.out.println("Message = "+msg);
	}
}
class Derived extends Base
{
	int val;
	Derived(String msg, int val)
	{
		super(msg);
		this.val = val;
	}
	void dis()
	{
		System.out.println("Method of Sub Class");
		System.out.println("Message = "+msg);
		System.out.println("val     = "+val);		
	}
}
class _30_overloading
{
	public static void main(String[] args) {
		Derived d = new Derived("hi",10);
		d.dis();
	}
}

/*
Method of Sub Class
Message = hi
val     = 10
*/