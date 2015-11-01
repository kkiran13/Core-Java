
public class DiameterOfBT {
	public int diameter(Node<?> n){
		if(n == null){
			return 0;
		}
		int lh = height(n.getLeft());
		int rh = height(n.getRight());
		int ldiameter = diameter(n.getLeft());
		int rdiameter = diameter(n.getRight());
		return Math.max(lh+rh+1,Math.max(ldiameter,rdiameter));
	}
	public int height(Node<?> n){
		if(n == null){
			return 0;
		}
		return 1 + Math.max(height(n.getLeft()),height(n.getRight()));
	}
}
