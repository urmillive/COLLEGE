import java.util.*;
class _39_stack
{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(123);
		s.push("Welcome");
		s.push("Student");

		System.out.println("Stack is empty : "+s.empty());
		
		System.out.println("Stack Element are : ");
		for (int i=1; i<4; i++) {
			System.out.println(s.pop());
		}
		System.out.println("Stack is empty : "+s.empty());

		s.push("xyz");
		s.push(234);
		System.out.println("xyz is at : "+s.search("xyz"));
	}
}
/*
Stack is empty : false
Stack Element are :
Student
Welcome
123
Stack is empty : true
xyz is at : 2
*/