package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab_List_ArrayList {


    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Bread");
        list.add("Milk");
        list.add("Paneer");
        list.add("Jam");
        list.add("Banana");
        list.add("Apple");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf("1"));
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.lastIndexOf("3"));

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

        System.out.println("----------");
        //use for each loop
        for (Object o: list){
            System.out.println(o);
        }

    }





}
