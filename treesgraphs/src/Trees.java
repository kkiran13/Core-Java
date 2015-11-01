import java.util.LinkedList;

public class Trees {

    Node threeRoot;
    private boolean isBalanced = true;

    Trees(Node threeRoot){
        this.threeRoot = threeRoot;
    }

    static class  Node{
        public Node root;
        public LinkedList<Node> children = new LinkedList<>();        
    }

     boolean isBalanced(Node node){
       if (threeRoot == null) {
            isBalanced = true;
        }
        if (threeRoot.children == null || threeRoot.children.isEmpty()) {
            isBalanced = true;
        }

        isBalancedRed(node);          
        return isBalanced;
    }

     void isBalancedRed(Node node) {
        if (node.children.isEmpty()) {
            if (node.root != null && node.root.children.size() == 1) {
                isBalanced = false;
            }
        }
        for(Node nodeEl : node.children)
        {
            isBalancedRed(nodeEl);
        }
    }

    public static void main(String[] args){
        Trees tree = new Trees(new Node());
        Node root = tree.threeRoot;
        Node leaf1 = new Node();
        Node leaf2 = new Node();
        Node leaf3 = new Node();
        Node leaf4 = new Node();
        Node leaf11 = new Node();

        root.children.add(leaf1);
        leaf1.root = root;
        root.children.add(leaf2);
        leaf2.root = root;
        root.children.add(leaf3);
        leaf3.root = root;
        root.children.add(leaf4);
        leaf4.root = root;

        leaf2.children.add(leaf11);
        leaf11.root = leaf2;

        System.out.println(tree.isBalanced(root));           
    }        
}