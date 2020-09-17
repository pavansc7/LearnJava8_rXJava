package Collections.HashMapEx;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.Map.*;

class ABC{
    int i;
    String s;
    ABC(int i,String s){
        System.out.println(this.i+" "+this.s);
        this.i=i;
        this.s=s;
    }
}
public class Ex1 {
    public static void main(String[] args) {

        new ABC(2, "");
        HashMap<Integer, String> mapEx = new HashMap<>();
        mapEx.put(2, "Kumar");
        mapEx.put(1, "Pavan");
        mapEx.put(null, null);
        {

        };
       // mapEx.forEach((key,val)->System.out.println("key = "+key+" Value ="+val));
//
//        Set<Integer> integerSet = mapEx.keySet();
//        Set<Map.Entry<Integer, String>> entries = mapEx.entrySet();
//
//        entries.forEach(System.out::println);

        //mapEx.getOrDefault()

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(3);

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
