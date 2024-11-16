package Nov;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_Map_P2 {
    public static void main(String[] args) {

        Map <String, Integer> map = new HashMap<>();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 32);
        map.put(null, 100);
//        map.put(null, 102);

        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("id"));
        System.out.println(map.containsValue(1));
        System.out.println(map.containsValue(22));

        System.out.println(map.keySet());
        System.out.println(map.values());



        //Iterate over the map
        for(Map.Entry<String, Integer> item : map.entrySet()){
            System.out.println(item.getKey() + " --> " + item.getValue());
        }




    }
}
