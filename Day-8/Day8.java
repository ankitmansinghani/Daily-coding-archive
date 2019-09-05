    // INITIAL CODE
    import java.util.Scanner;
    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.Stack;
    import java.util.HashMap;
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    // A Binary Tree node
    class Node
    {
        int data;
        Node left, right;
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    class Day8
    {
        
        
        // driver function to test the above functions
        public static void main(String args[])
        {
            
            // Input the number of test cases you want to run
            int[] array={1,1,1,0,1,1,1};
            
           System.out.println(Level_order_traversal.levelOrder(generateTree(array)));
        }

        public static Node generateTree(int[] array) {        
                if(array == null || array.length == 0)
                 return null;
                 Node n = new Node(array[0]);
                 Node root = n;
                 Queue<Node> queue =new LinkedList<>();
                 queue.add(n);
                 int count=0;
                 while(count<array.length && !queue.isEmpty())
                 {
                         n=queue.remove();
                         int pos=2*count+1;
                         if(pos<array.length && array[pos]!=-1) {
                             n.left=new Node(array[pos]);
                             queue.add(n.left);
                         }
                         pos+=1;
                         if(pos<array.length && array[pos]!=-1)
                         {
                             n.right=new Node(array[pos]);
                             queue.add(n.right);
                         }
                        count++;
                 }
                 return root;
             }            
    }   

    class Level_order_traversal
    {
        //You are required to complete this method
        static int levelOrder(Node node) 
        {
            int count=0;
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            while(!q.isEmpty())
            {

                Node temp = q.remove();
                if(temp.left==null && temp.right==null) count++;
                else if(temp.left!=null && temp.right!=null)
                {
                    if(temp.left.data==temp.right.data) count++;
                    q.add(temp.left);
                    q.add(temp.right);
                }
                else if(temp.left!=null && temp.right==null)
                {
                    q.add(temp.left);
                }
                else q.add(temp.right);

            }

            return count;
        }
    }