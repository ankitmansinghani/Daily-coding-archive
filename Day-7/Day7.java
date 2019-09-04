import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

/**
 * Day7
 */
public class Day7 {

    static public List<Stack<Integer>> opSet = new ArrayList<>();

    public static void main(String[] args) {
        getCount(12345);
    }

    public static void getCount(int x) {
        Stack<Integer> stack = new Stack<>();
        getCountUtil(stack,x);
    }

    public static void getCountUtil(Stack<Integer> stack,int x) {
        if(x>0)
        {
            System.out.println("Every iteration x value : "+x);
            if(x%100<25)
            {
                stack.push(x%10);
                getCountUtil(stack, x/10);
                stack.pop();
                stack.push(x%100);
                getCountUtil(stack, x/100);
                stack.pop();
            }
            else
            {
                stack.push(x%10);
                getCountUtil(stack, x/10);
                stack.pop();
            }
        }
        else
        {
            System.out.println("***********Combination****************");
            System.out.println(Arrays.toString(stack.toArray()));
            opSet.add(stack);
            System.out.println("length of set : "+opSet.size());
        }
        
    }
}