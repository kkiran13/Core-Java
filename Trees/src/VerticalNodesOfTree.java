import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

// time complexity of this implementation is O(nLogn).
public class VerticalNodesOfTree {
	public void PrintVertical(TNode n){
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		int hd = 0;
		GetVerticalOrder(n, hd, map);
		for(Entry<Integer, ArrayList<Integer>> ee : map.entrySet()){
			System.out.println(ee.getKey()+": "+ee.getValue());
		}
	}
	
	public void GetVerticalOrder(TNode n,int hd,HashMap<Integer, ArrayList<Integer>> map){
		if(n == null){
			return;
		}
		if(map.get(hd) == null){
			map.put(hd,new ArrayList<Integer>());
		}
		map.get(hd).add(n.data);
		GetVerticalOrder(n.left,hd-1,map);
		GetVerticalOrder(n.right,hd+1,map);
	}
}
