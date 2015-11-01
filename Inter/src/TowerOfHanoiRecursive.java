/*Recursive Algorithm 
The recursive solution to move n discs from the start pole to the end pole using an 
auxiliary pole is given below. 

Base Case - When n = 1
Move the disc from start pole to end pole 

Recursive Case - When n > 1
Step 1: Move (n-1) discs from start pole to auxiliary pole.
Step 2: Move the last disc from start pole to end pole.
Step 3: Move the (n-1) discs from auxiliary pole to end pole.
Steps 1 and 3 are recursive invocations of the same procedure. 
 * */

public class TowerOfHanoiRecursive {

   public void solve(int n, String start, String auxiliary, String end) {
       if (n == 1) {
           System.out.println(n+" "+start + " -> " + end);
       } else {
           solve(n - 1, start, end, auxiliary);
           System.out.println(n+" "+start + " -> " + end);
           solve(n - 1, auxiliary, start, end);
       }
   }

   public static void main(String[] args) {
	   TowerOfHanoiRecursive towersOfHanoi = new TowerOfHanoiRecursive();
       towersOfHanoi.solve(4, "A", "B", "C");
   }
}