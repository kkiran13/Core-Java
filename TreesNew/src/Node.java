
 public class Node<T>
 {
  public Node<T> left;
  public Node<T> right;
  public int data;
  public Node(int data)
  {
   this.data = data;
  }
  public Node<T> getLeft()
  {
   return this.left;
  }
  public void setLeft(Node<T> left)
  {
   this.left = left;
  }
  public Node<T> getRight()
  {
   return this.right;
  }
  public void setRight(Node<T> right)
  {
   this.right = right;
  }
 }