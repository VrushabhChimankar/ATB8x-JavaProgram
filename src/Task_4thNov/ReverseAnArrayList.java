package Task_4thNov;

import java.util.ArrayList;

public class ReverseAnArrayList {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Vrushabh");
        list.add("Chimankar");
        list.add("Golu");
        list.add("Pintu");
        list.add("Raj");

        System.out.println("Print the list: " + list);

        //reverse the list
        System.out.println("Reverse an arraylist: " + list.reversed());

    }
}
