
public class PathFromRootToLeaves {
	public boolean isLeaf(Node<?> n){
		if(n.getLeft() == null && n.getRight() == null){
			return true;
		}else{
			return false;
		}
	}
	public void printPathsRecur(Node<?> n,int[] patharray,int pathlen){
		if(n != null){
			patharray[pathlen] = (Integer) n.data;
			pathlen++;
		}
		if(isLeaf(n)){
			printarray(patharray, pathlen);
		}else{
			printPathsRecur(n.getLeft(),patharray,pathlen);
			printPathsRecur(n.getRight(),patharray,pathlen);
			}
	}
	public void printarray(int[] patharray,int pathlen){
		for(int i=0;i<pathlen;i++){
			if(patharray[i] != 0){
			System.out.print(patharray[i]+" ");
			}
		}
		System.out.println();
	}
}
