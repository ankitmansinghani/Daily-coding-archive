import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Day3
 */
public class Day3 {

    public static void main(String[] args) {
        Node node;
        node = new Node("root",new Node("left",new Node("left.left")),new Node("right"));
        System.out.println(serialize(node));
        String temp = serialize(node);
        Node n = deserialize(temp);
        System.out.println("Final value"+n.right.val);
    }

    public static void serializeUtil(Node root,ArrayList<String>str) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp = q.remove();
            str.add(temp.val);
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
    }
    public static String serialize(Node root) {
        ArrayList<String> str= new ArrayList<>(); 
        serializeUtil(root,str);
        return str.toString();
    }

    public static Node deserialize(String x) {
        System.out.println(x);
        String[] arr = x.substring(1, x.length()-1).split(",");
        Node root=new Node(arr[0]);
        int count=0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        count++;
        while(count<arr.length)
        {
            Node temp = q.remove();
            if(temp.left==null && count<arr.length)
            {
                temp.left=new Node(arr[count]);
                q.add(temp.left);
                count++;
            }
            if(temp.right==null && count<arr.length)
            {
                temp.right=new Node(arr[count]);
                q.add(temp.right);
                count++;
            }
        }
        return root;
    }
}

/**
 * Node
 */
class Node {
    String val;
    Node left;
    Node right;

    
    Node(String val,Node left,Node right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

    Node(String val)
    {
        this.val=val;
        this.left=null;
        this.right=null;
    }
    
    Node(String val,Node node)
    {
        this.val=val;
        this.right=node;
        this.left=null;
    }
}