package CollectionFramework2;

import java.util.LinkedList;

public class Lab_LinkedList {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();
        myList.add("Vrushabh");
        myList.add("Chimankar");
        myList.add("Ajay");
        System.out.println(myList);

        for (int i = 0; i < myList.size(); i++) {

            System.out.println(myList.get(i));
        }

        for(Object o : myList){
            System.out.println(o);
        }

        System.out.println(myList.contains("Vrushabh"));

    }
}
