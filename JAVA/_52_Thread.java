class _52_Thread
{
	public static void main(String[] args) {
		Thread t = Thread.currentThread();

		System.out.println("The Thread = "+t);
		System.out.println("Name of Thread = "+t.getName());
		t.setName("My Thread");
		System.out.println("Name of Thread = "+t.getName());
	}
}

/*
The Thread = Thread[main,5,main]
Name of Thread = main
Name of Thread = My Thread
*/