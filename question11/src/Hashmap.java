
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

class Hashmap {

public static void main(String[] args) {
   HashMap<String,String> hm = new HashMap<String,String>();
   hm.put("3","three");
   hm.put("1","one");
   hm.put("4","four");
   hm.put("2","two");
   printMap(hm);
   Map<String, String> treeMap = new TreeMap<String, String>(hm);
   printMap(treeMap);
}//main

public static void printMap(Map<String,String> map) {
    Set s = map.entrySet();
    Iterator it = s.iterator();
    while ( it.hasNext() ) {
       Map.Entry entry = (Map.Entry) it.next();
       String key = (String) entry.getKey();
       String value = (String) entry.getValue();
       System.out.println(key + " => " + value);
    }//while
    System.out.println("========================");
}//printMap

}//class
