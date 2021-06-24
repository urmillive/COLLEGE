class Mt implements Runnable
{
	Mt()
	{
		Thread t = new Thread(this,"My Thread");
		t.start();
	}
	public void run()
	{
		for (int i=1; i<6; i++) {
			System.out.println("Thread "+i);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted");
			}
		}
	}
}
class _54_Create_thread_runnable
{
	public static void main(String[] args) {
		Mt mt = new Mt();
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}
}

/*
Thread 1
Main Thread Exiting
Thread 2
Thread 3
Thread 4
Thread 5
*/