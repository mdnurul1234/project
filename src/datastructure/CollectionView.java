package datastructure;

import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.HashMap;

public class CollectionView {


public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

     System.out.println(map.get(1));
        System.out.println(map.get(5));
             for(Entry<Integer,String>country:map.entrySet()){
                     System.out.println(country.getKey()+ " " + country.getValue());
             }
    }

}
