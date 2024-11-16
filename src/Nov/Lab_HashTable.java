package Nov;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab_HashTable {
    public static void main(String[] args) {


        //No null keys
        Hashtable<String, Integer> ht = new Hashtable();
        ht.put("id", 1);
        ht.put("id2", 2);
        ht.put("id3", 3);
        //ht.put("id4", null);
        System.out.println(ht);

        //Iterate over the Hashtable

       Enumeration <String> e = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
            //System.out.println(ht.get(e.nextElement()));
        }

    }
}
