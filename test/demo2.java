import java.util.Iterator;
import java.util.TreeSet;

public class demo2 {
    public static void main(String[] args)
    {
        TreeSet<String> ts = new TreeSet();
        ts.add("x");
        ts.add("y");
        ts.add("a");
//        ts.add(99);
        System.out.println(ts);
//        泛型
        Iterator<String> ite = ts.iterator();
        while (ite.hasNext())
        {
                String str = ite.next();
//            Object obj = ite.next();
//            String str = (String)obj;
            System.out.println(str.toUpperCase());
        }
    }
}




