package CollectionFramework2;

import java.util.*;

public class Lab_HS_LHS_TS {
    public static void main(String[] args) {

        Set hs = new HashSet();
        hs.add("Vrushabh");
        hs.add("Apple");
        hs.add("Apple");
        hs.add("Orange");
        hs.add(null);

        System.out.println(hs);

        Set lhs = new LinkedHashSet();
        lhs.add("Vrushabh");
        lhs.add("Pintu");
        lhs.add("Chimankar");
        lhs.add("Sahu");

        System.out.println(lhs);

        Set ts = new TreeSet();
        ts.add("Vrushabh");
        ts.add("Chimankar");
        ts.add("Banti");
        System.out.println(ts);

        Iterator iterator = ts.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
