import java.util.*;

public class Hashmap{
public static void main(String args[]){
  Map map = new HashMap();
  map.put("witcher","Gerald of Rivia");
  map.put("mage","Yennefer");
  map.put("child","Ciri");

  map.remove("child");

  System.out.println(map);
  System.out.println(map.size());
}
}
