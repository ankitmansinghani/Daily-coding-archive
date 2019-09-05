import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Day7 {
	static public Set<Stack<Integer>> opSet = new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	Stack<Integer> stack = new Stack<>();
	    	getCountUtil(stack,12345);
	        System.out.println("length of set : "+opSet.size());		

	}
	    public static void getCountUtil(Stack<Integer> stack,int x) {
	        if(x!=0)
	        {
	            //System.out.println("Every iteration x value : "+x);
	            stack.push(x%10);
	            getCountUtil(stack, x/10);
	            stack.pop();
	            
	            if(x%100<25 && x>25 && x%100!=0)
	            {
	            	stack.push(x%100);
	                getCountUtil(stack, x/100);
	                stack.pop();
	            }
	            else if(x<25)
	            {                
	                stack.push(x);
	                getCountUtil(stack, 0);
	                stack.pop();
	            }
	            
	        }
	        else
	        {
	            System.out.println("******Valid Combination****************");
	            System.out.println(stack.toString());
	            opSet.add(stack);
	        
	        }
	        
	    }
	}
