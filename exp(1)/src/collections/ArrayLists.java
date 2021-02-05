package collections;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Jhansi");
		a.add("Jahnavi");
		a.add("Supriya");
		System.out.println(a);
		a.add(2,"sravani");
		System.out.println(a);
		a.remove("Jahnavi");
		System.out.println(a);
	}

}
