class ThreadTest extends Thread
{
	ThreadTest()
	{
		super("My Thread");
	}
	public void run()
	{
		try
		{
			for (int i=1; i<6; i++) {
				System.out.println("Thread "+i);
				Thread.sleep(300);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted");
		}
	}
}
class _53_create_thread_using_thread_class
{
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		t.start();
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted");
		}
		System.out.println("Thread Exited");
	}
}

/*
Thread 1
Thread 2
Thread 3
Thread 4
Thread 5
Thread Exited
*/