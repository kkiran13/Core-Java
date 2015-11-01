
public class LeavesCount {
	public int leafcount(Node<?> n){
		if(n == null){
			return 0;
		}else if(n.getLeft()==null && n.getRight()==null){
			System.out.print(n.data+" ");
			return 1;
		}else{
			return leafcount(n.getLeft())+leafcount(n.getRight());
		}
	}	
}
