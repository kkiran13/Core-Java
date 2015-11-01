import java.util.TreeMap;
 
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Double> students = new TreeMap<String, Double>();
        //Add Key/Value pairs
        students.put("Ed", 47.4);
        students.put("Alan", 34.2);
        students.put("Sheila", 65.8);
        students.put("Becca", 44.1);
        System.out.println(students.size());
        for(int i=0;i<3;i++){
        String a = (students.keySet().toArray()[i]).toString();
        //System.out.println(students.values().toArray()[0]);
        double b = Double.parseDouble(students.values().toArray()[i].toString());
        System.out.println(a+" "+b);
        }
        //Iterate over HashMap
        /*for(String key: students.keySet()){
            System.out.println(key  +" :: "+ students.get(key));
        }
        System.out.println();
        /*int i = 0;
        //while(i<2){
        for(String key: students.keySet()){
        	 while(i<2){
        		 i++;
        	System.out.println(key  +" :: "+ students.get(key));
        }
        }*/
    }
}