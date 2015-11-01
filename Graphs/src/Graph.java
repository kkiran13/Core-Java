import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
	public HashMap<Integer, LinkedList<Integer>> adj;
	public HashMap<Integer, Boolean> visited;
	public Graph(int[] nodes){
		adj = new HashMap<Integer, LinkedList<Integer>>();
		visited = new HashMap<Integer, Boolean>();
		for(int i=0;i<nodes.length;i++){
			adj.put(nodes[i], new LinkedList<Integer>());
			visited.put(nodes[i], false);
		}
	}
	public void addEdge(int v1,int v2){
		adj.get(v1).add(v2);
		//adj.get(v2).add(v1);
	}
	
	public LinkedList<Integer> getNeighbors(int v){
		return adj.get(v);
	}
}
