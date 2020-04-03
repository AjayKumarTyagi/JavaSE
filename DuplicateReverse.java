import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DuplicateReverse {

	public static void main(String[] args) {
	ArrayList<Integer> obj=new ArrayList();  //making object of arraylist
	obj.add(1);
	obj.add(2);
	obj.add(3);
  obj.add(4);
  obj.add(5);
	Iterator it=obj.iterator();   //using iterator to operate on a particular value as we don't have index in collections
	System.out.println("\noriginal list: ");
	while(it.hasNext())
	{
	System.out.print(it.next()+" ");	 //using next method of collection class
	}
ArrayList newone=new ArrayList();
newone=(ArrayList)obj.clone();  //making duplicate objects using clone method
System.out.println("\nDuplicate list: ");
System.out.println(newone);
Collections.reverse(obj);
System.out.println("\nReverse list: ");
System.out.println(obj);
	}

}
