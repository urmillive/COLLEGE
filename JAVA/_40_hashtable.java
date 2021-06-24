import java.util.*;
class _40_hashtable
{
	public static void main(String[] args) {
		Hashtable ht = new Hashtable(6);
		ht.put("fn","Donald");
		ht.put("ln","Trump");
		ht.put("city","America");

		System.out.println("First Name = "+ht.get("fn"));
		System.out.println("City = "+ht.get("city"));

		System.out.println("Hashtable is = "+ht);

		String str = ht.toString();

		System.out.println("Hashtable as String = "+str);
	}
}

/*
First Name = Donald
City = America
Hashtable is = {city=America, ln=Trump, fn=Donald}
Hashtable as String = {city=America, ln=Trump, fn=Donald}
*/