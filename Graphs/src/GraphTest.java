
public class GraphTest {
	public static void main(String[] args){
		int[] arr1 = {10,41,62,83};
		int[] arr2 = {1,2,3,4,5,6,7};
		int[] arr3 = {1,2,3,4,5};
		
		Graph g = new Graph(arr1); //BFS graph
		g.addEdge(10, 41);
		g.addEdge(10, 62);
		g.addEdge(41, 62);
		g.addEdge(62, 10);
		g.addEdge(62, 41);
		g.addEdge(62, 83);
		g.addEdge(83, 83);
		BFSandDFS bfsdfs = new BFSandDFS();
		System.out.print("BFS: ");
		bfsdfs.BFS(g, 10);
		System.out.println();
		
		Graph g1 = new Graph(arr1); //DFS graph
		g1.addEdge(10, 41);
	    g1.addEdge(10, 62);
	    g1.addEdge(41, 62);
	    g1.addEdge(62, 10);
        g1.addEdge(62, 83);
        System.out.print("DFS: ");
        bfsdfs.DFS(g1, 62);
        System.out.println();
        
        Graph g2 = new Graph(arr2);
        g2.addEdge(1, 2);
        //g2.addEdge(2, 1);
	    g2.addEdge(2, 3);
	    //g2.addEdge(3, 2);
	    g2.addEdge(3, 4);
	    //g2.addEdge(4, 3);
	    //g2.addEdge(4, 5);
	    //g2.addEdge(5, 6);
	    //g2.addEdge(6, 7);
	    //g2.addEdge(7, 1);
        boolean b = bfsdfs.IsCycleDirected(g2,1);
        if(b){
        	System.out.println("Graph is Cyclic");
        }else{
        	System.out.println("Not a Cyclic Graph");
        }
        
        Graph g3 = new Graph(arr3);
        g3.addEdge(5,0);
        g3.addEdge(4,0);
        g3.addEdge(4,1);
        g3.addEdge(3,1);
        g3.addEdge(2,3);
        g3.addEdge(5,2);
        //bfsdfs.TopologicalSort(g3, 5);
    }
}
