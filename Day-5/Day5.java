
/**
 * Day5
 */
public class Day5 {

    public static void main(String[] args) {

        System.out.println(car(cons(3, 4)));
        System.out.println(cdr(cons(3, 4)));
        Pair pair = cons(3, 4);
        System.out.println(car(pair));
        System.out.println(cdr(pair));

    }

    public static Pair cons(int a,int b) {
        return new Pair(a,b);
    }

    public static int car(Pair obj) {
        return obj.a;
    }

    public static int  cdr(Pair obj) {
        return obj.b;
    }
}

class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}