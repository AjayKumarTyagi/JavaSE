import java.util.HashMap;

public class HashMapCollector {

	public static void main(String[] args) {
		HashMap <Integer,String> obj=new HashMap<>();  //making object of HashMap
obj.put(1, "Ajay");    //Adding values in HashMap
obj.put(2, "Bosco");
obj.put(3, "Arthur");
System.out.println("HashMap contains key 2: "+obj.containsKey(2));    //checking whether HashMap contains a particular key or not
System.out.println("HashMap contains value Arthur: "+obj.containsValue("Arthur"));  //checking whether HashMap contains a particular value or not
System.out.println("Printing keys: "+obj.keySet());  //to get all the keys from the HashMap
System.out.println("Printing key-value pair: "+obj);
	}

}
