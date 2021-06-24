class MyThread implements Runnable
{
	Thread t;
	String name;
	MyThread(String name)
	{
		this.name = name;
		t = new Thread(this,name);
		System.out.println("The Thread Created "+t);
		t.start();
	}
	public void run()
	{
		for (int i=1; i<6; i++) {
			System.out.println("Thread "+name+" "+i);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted");
			}
		}
		System.out.println("Complate "+name);
	}
}
class _56_Multiple_thread
{
	public static void main(String[] args) {
		MyThread mt = new MyThread("First");
		new MyThread("Second");
		new MyThread("Third");
		try
		{
			Thread.sleep(2500);
			System.out.println("Main Thread Complate");
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
	}
}

/*
The Thread Created Thread[First,5,main]
The Thread Created Thread[Second,5,main]
The Thread Created Thread[Third,5,main]
Thread Second 1
Thread First 1
Thread Third 1
Main Thread Complate
Thread Second 2
Thread Third 2
Thread First 2
Thread Third 3
Thread Second 3
Thread First 3
Thread Third 4
Thread Second 4
Thread First 4
Thread Second 5
Thread First 5
Thread Third 5
Complate Second
Complate Third
Complate First
*/