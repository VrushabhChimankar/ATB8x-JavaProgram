package Nov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab_ListContainsMap {
    public static void main(String[] args) {


        HashMap<String, String> students1 = new HashMap();
        students1.put("Name", "Vrushabh");
        students1.put("Roll", "1");
        students1.put("Phone", "9876543210");

        HashMap<String, String> students2 = new HashMap();
        students2.put("Name", "Amit");
        students2.put("Roll", "2");
        students2.put("Phone", "9652376132");

        List students = new ArrayList();
        students.add(students1);
        students.add(students2);
        System.out.println(students);






    }
}
