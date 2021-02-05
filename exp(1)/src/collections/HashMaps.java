package collections;

import java.util.*;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(1201, "Anulekha");
		mp.put(1202, "Jhansi");
		mp.put(1203, "Bhrgavi");
		mp.put(1204, "Manasa");
		Set keys = mp.entrySet();
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			 System.out.print(me.getKey() + ": ");
			 System.out.println(me.getValue()); 
		}
		System.out.println();
		mp.remove(1203);
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			 System.out.print(me.getKey() + ": ");
			 System.out.println(me.getValue()); 
		}
		System.out.println();
		mp.replace(1201, "Jahnavi");
		Iterator it1 = keys.iterator();
		while(it1.hasNext()) {
			Map.Entry me = (Map.Entry)it1.next();
			 System.out.print(me.getKey() + ": ");
			 System.out.println(me.getValue()); 
		}
	}

}
