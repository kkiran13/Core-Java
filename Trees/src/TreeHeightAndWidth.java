
public class TreeHeightAndWidth {
	public int height(Node<?> n){
		if(n == null){
			return 0;
		}else{
			return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
		}
	}
	public int getMaxWidth(Node<?> n){
		int maxwidth = 0;
		int width;
		for(int i=1;i<height(n);i++){
			width = getWidth(n,i);
			if(width > maxwidth){
			  maxwidth = width;	
			}
		}
		return maxwidth;
	}
	public int getWidth(Node<?> n,int level){
		if(n == null){
			return 0;
		}
		if(level == 1){
			return 1;
		}else if(level > 1){
			return getWidth(n.getLeft(), level-1) + getWidth(n.getRight(),level-1);
		}
		return level;
	}
}