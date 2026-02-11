package javaPackage;

import java.util.HashMap;

//Hashmap and hashtable are used for mapping the data
//Hashmap is not thread safe and HashTable is thread safe
//Hashmap is not synchronized hence fast execution and utilizes less memory
//Hashtable is synchronized hence it is slow execution
//Hashmap allows one null key and multiple key values
//Hashtable does not allow null key or values


public class HashMp1 {

	public static void main(String[] args) {
		HashMap <Integer, String> hm = new HashMap<Integer, String>();

	hm.put(1, "Jan");
	hm.put(2, "feb");
	hm.put(3, "Mar");
	
	System.out.println(hm.get(1));
	System.out.println(hm.get(2));
	System.out.println(hm.get(3));
	
	
	}

}
