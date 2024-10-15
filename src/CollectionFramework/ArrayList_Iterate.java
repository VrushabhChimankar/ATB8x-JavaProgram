package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Iterate {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Vrushabh");
        names.add("Chimankar");
        names.add("Pintu");
        names.add("Shahu");

        for (String str : names){
            System.out.println(str);
        }

        System.out.println("-----To Print arrayList");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


        System.out.println("3rd array list");

        Iterator<String> interator = names.iterator();
        while (interator.hasNext()){
            System.out.println(interator.next());
        }



    }
}
