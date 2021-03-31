import java.util.function.Predicate;

public class Predicator {
	
    static boolean testit(Object s, Predicate<Object> p)
    {
        return p.test(s);
    }
    public static void main(String[] args) {
        final String s1 = "HI";
        final Integer i1 = 3;
        final int x=1;
        MyPredicates<Object>[] p = new MyPredicates[4];
        p[0] = new MyPredicates(e -> e.equals(s1));
        p[1] = new MyPredicates(e -> {if (x==1) return e.equals(s1); return !e.equals(s1);});
        p[2] = new MyPredicates(e -> {if (x!=1) return e.equals(i1); return !e.equals(s1);});
        p[3] = new MyPredicates((Object e) -> {if (x!=1) return e.equals(i1); return !e.equals(s1);});
        for (MyPredicates<Object> pp:p) {
            System.out.println(testit(s1,pp));
        }
    }
}

class MyPredicates<T> implements Predicate<T>{
    Predicate<T> local;
    MyPredicates(Predicate<T> t){ local=t;}
    @Override public boolean test(T t) { return local.test(t);}
}
	
	
	
	
