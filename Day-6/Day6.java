
//Algo
/**
 * 
 * 
 * Understanding possible solution:
 * 
 * a = 1 0 1 (previous object memory code)
 * b = 1 1 1 (next object memory code)
 * =======================================
 * c = 0 1 0 (field Both vlaue)
 * =======================================
 * 
 * a->c->b
 * 
 * 
 * if i have to move forward then prev value is required.
 * 
 * if we keep track of prev so we can XOR it with current and get next.
 * 
 * 
 * in example let's assume we have above list and we are willing to travers
 * list NULL-> a(add: 100 both:101)->b(add: 101 both:011)->c(add: 111 both:101) -> NULL
 * 
 * keep head and tail address to traverse list forward and backwards respectively.
 * 
 * 
 * 
 * A address 100 is known:
 * 
 * prev = null = 0 0 0
 * cur  = aBoth= 1 0 1
 * =======================================
 * nxt = bAdd = 1 0 1 will move to B's address
 * 
 * prev = aAdd = 1 0 0
 * cur  = bBoth = 0 1 1
 * =======================================
 * nxt = cAdd = 1 1 1 will be address of C
 * 
 * prev = bAdd = 1 0 1
 * cur  = cBoth = 1 0 1
 * ======================================
 * nxt = End of List= 0 0 0 nxt element is null so end of list
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * class Node{
 *      int data;
 *      Node Both;
 *      Node(int data)
 *      {
 *          this.data=data;
 *          Both=null;
 *      } 
 * }
 * 
 * 1->2->3->4
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */