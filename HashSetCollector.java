import java.util.HashSet;

public class HashSetCollector {

	public static void main(String[] args) {
		HashSet<Integer> obj= new HashSet<>();  //making object of HashSet
obj.add(3);
obj.add(2);      //Adding values to HashSet
obj.add(10);
obj.add(1);
HashSet newone=new HashSet();
newone=(HashSet)obj.clone();   //cloning a object in another new object of HashSet
System.out.println("printing clone hash set: ");
System.out.println(newone);
//clearing all elements
newone.clear();
System.out.println("After clearing everything newone hashset will look like: "+ newone);
	System.out.println("HashSet contains value 3: "+obj.contains(3));
	}

}
