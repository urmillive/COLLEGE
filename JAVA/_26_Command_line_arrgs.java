class _26_Command_line_arrgs
{
	public static void main(String[] args) {
		for (int i=0; i<args.length; i++) {
			System.out.println("Argument "+i+" "+args[i]);
		}
	}
}

/*
=>  java _26_Command_line_arrgs 12 hello world
Argument 0 12
Argument 1 hello
Argument 2 world
*/