class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}
class _51_own_exeption
{
	public static void main(String[] args) {
		try
		{
			throw new MyException("Exception is Here");
		}
		catch(MyException me)
		{
			System.out.println("Cought Here");
			System.out.println(me.getMessage());
		}
	}
}

/*
Cought Here
Exception is Here
*/