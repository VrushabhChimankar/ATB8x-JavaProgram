package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab_ArrayList {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(99);
        marks.add(97);
        marks.add(78);
        marks.add(74);

        System.out.println(marks);
        Collections.sort(marks); //Sorting of the marks
        System.out.println(marks);
        Collections.reverseOrder();
        System.out.println(marks); //reversing order
    }
}
