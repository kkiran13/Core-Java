import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class BFSandDFS {
	
	public void BFS(Graph g, int n){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		
		while(!q.isEmpty()){
			n = q.poll();
			System.out.print(n+" ");
			g.visited.put(n, true);
			Iterator<Integer> itr = g.adj.get(n).iterator(); 
			//getting Neighbors of node // also g.getNeighbors(n) works
			while(itr.hasNext()){
				Integer num = itr.next();
				//System.out.println("Num"+num);
				if(!g.visited.get(num)){
					g.visited.put(num,true);
					q.add(num);
				}
			}
		}
	}
	
	public void DFS(Graph g, int n){
		while(!g.visited.get(n)){
			System.out.print(n+" ");
			g.visited.put(n, true);
			Iterator<Integer> itr = g.getNeighbors(n).iterator();
			while(itr.hasNext()){
				Integer num = itr.next();
				DFS(g,num);
			}
		}
	}
	
	public boolean IsCycleDirected(Graph g, int n){
		g.visited.put(n, true);
		Iterator<Integer> itr = g.adj.get(n).iterator();
		while(itr.hasNext()){
			Integer num = itr.next();
			if(g.visited.get(num) || IsCycleDirected(g, num)){
				return true;
			}
		}
		return false;
	}
	
	public boolean IsCycleUndirected(Graph g, int n){
		boolean[] visit = new boolean[g.adj.size()];
		for(int i=0;i<g.adj.size();i++){
			visit[i] = false;
		}
		for(int i=0;i<g.adj.size();i++){
		   if(!visit[i]){
			   if(IsCycleUndirectedUtil(i,visit,-1)){
				   return true;
			   }
		   }
		}
		return false;
	}
	
	public boolean IsCycleUndirectedUtil(int v, boolean[] visit,int parent){
		visit[v] = true;
		return false;
		
	}
	
	/*public void TopologicalSort(Graph g,int n){
		Stack<Integer> st = new Stack<Integer>();
		while(!g.visited.get(n)){
			Iterator<Integer> itr = g.getNeighbors(n).iterator();
			while(itr.hasNext()){
				Integer num = itr.next();
				if(!g.visited.get(num)){
					st.push(num);
					g.visited.put(num, true);
					TopologicalSort(g,num);
				}
				st.push(n);
				g.visited.put(n, true);
			}
		}
		while(!st.isEmpty()){
			System.out.print(st.pop()+" ");
		}
	}*/
}
