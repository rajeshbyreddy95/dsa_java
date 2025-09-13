package step1.lec5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 3);
        map.put(2, 4);

        System.out.println(map);

        // getting by key
        System.out.println(map.get(1));
        System.out.println(map.get(3)); // key 3 is not exist in map , so it return null

        // contains key
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(3));

        int arr[] = {2,3,4,2,5,2,2};
        for(Integer x: arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        ArrayList<Integer> keys = new ArrayList<>(map.values());
        Collections.sort(keys);
        for(Integer x:keys){
            System.out.println(x+" ->"+map.get(x));
        }
        System.out.println(map);
    }
}
