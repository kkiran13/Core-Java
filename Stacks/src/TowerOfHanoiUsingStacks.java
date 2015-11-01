/*
 * Java Program to Solve Tower of Hanoi Problem using Stacks
 */
 
 import java.util.*;
 
 /* Class TowerOfHanoiUsingStacks */
 public class TowerOfHanoiUsingStacks
 {
     public static int N;
     /* Creating Stack array  */
     public static Stack<Integer>[] tower = new Stack[4]; 
 
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         tower[1] = new Stack<Integer>();
         tower[2] = new Stack<Integer>();
         tower[3] = new Stack<Integer>();
         /* Accepting number of disks */         
         System.out.println("Enter number of disks");
         int num = scan.nextInt();
         N = num;
         toh(num);
         display();
     }
     
     /* Function to push disks into stack */
     public static void toh(int n)
     {
         for (int d = n; d > 0; d--){
        	 tower[1].push(d);
     	 }	
         display();
         move(n, 1, 2, 3);         
     }
     
     /* Recursive Function to move disks */
     public static void move(int n, int start, int aux, int end)
     {
         if (n > 0)
         {
             move(n-1, start, end, aux);    //Move n-1 discs from start to aux                                            
             tower[end].push(tower[start].pop()); // Move last disc from start to end
             display();                   
             move(n-1, aux, start, end);     //Move n-1 discs from aux to end  
         }         
     }
     /*  Function to display */
     public static void display()
     {
         System.out.println("  A  |  B  |  C");
         System.out.println("---------------");
         for(int i = N - 1; i >= 0; i--)
         {
             String d1 = " ", d2 = " ", d3 = " ";
             try
             {
                 d1 = String.valueOf(tower[1].get(i));
             }
             catch (Exception e){
             }    
             try
             {
                 d2 = String.valueOf(tower[2].get(i));
             }
             catch(Exception e){
             }
             try
             {
                 d3 = String.valueOf(tower[3].get(i));
             }
             catch (Exception e){
             }
             System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);
         }
         System.out.println("\n");         
     }
 }