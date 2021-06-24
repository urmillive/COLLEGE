import java.util.*;
class _38_Random_class
{
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("Random Integer = "+r.nextInt());
		System.out.println("Random Num 1 to 10 = "+r.nextInt(10));
		System.out.println("Random Double = "+r.nextDouble());
		System.out.println("Random Boolean = "+r.nextBoolean());
	}
}

/*
Random Integer = -1297954461
Random Num 1 to 10 = 3
Random Double = 0.35131491480231614
Random Boolean = true
*/