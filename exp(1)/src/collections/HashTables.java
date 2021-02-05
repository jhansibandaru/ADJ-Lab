package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,Integer> ht = new Hashtable<>();
		ht.put(1201, 10);
		ht.put(1202, 9);
		ht.put(1203, 9);
		for(Map.Entry itr:ht.entrySet()) {
			System.out.println(itr.getKey()+":"+itr.getValue());
		}
		System.out.println();
		ht.remove(1202);
		for(Map.Entry itr1:ht.entrySet()) {
			System.out.println(itr1.getKey()+":"+itr1.getValue());
		}
	}

}

