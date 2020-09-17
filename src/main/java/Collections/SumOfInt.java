package Collections;

import java8_package.Person.Person;

import java.util.*;
import java.util.stream.Collectors;

public class SumOfInt {
    public static void main(String[] args) throws Exception {
       List<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(10,20,3,2,3,4,5,6));
////
      // list.stream().map((val)->val+10).sorted().forEach(val->System.out.println(val));
////        list.forEach(val->System.out.println(val));
       Map<Integer,String> m = list.stream().filter(val->val>0).collect(Collectors.toMap((val)->val,val->val.toString()+" I am pk",(v1,v2)->v1));

        TreeSet<Integer> treeSet = list.stream().collect(Collectors.toCollection(()->new TreeSet<>()));

    for (int i=0;i<list.size();i++){
        list.set(i,list.get(i)+100);
    }

        System.out.println(" Position of 5 element using binar search "+Collections.binarySearch(list,105));

       System.out.println("Map o/p ---------------- ");
        Set<Map.Entry<Integer,String>> set = m.entrySet();
        set.forEach(System.out::println);

        System.out.println("List o/p ---------------- ");
        list.forEach(val->System.out.println(val));

        System.out.println("Tree o/p ---------------- ");
        treeSet.forEach(System.out::println);
        //System.out.println(list.size());
////        System.out.println(list1);
//
//        String list = "age";
//        Map<String,Map<String,Integer>> mapMap = new HashMap<>();
//
//        Map<String,Integer> mapMap1[] = new HashMap[3];
//        Map<String, Integer> map1 = new HashMap<String, Integer>();
//        map1.put("Pavan",1);
//        map1.put("age",9);
//        Map<String, Integer> map2 = new HashMap<String, Integer>();
//        map2.put("pragati",2);
//        map2.put("age",20);
//        Map<String, Integer> map3 = new HashMap<String, Integer>();
//        map3.put("rram",23);
//        map3.put("asa",32);
//      //  mapMap1[0] = new HashMap();
//        //mapMap1[0].put("pavan",20);
//        mapMap1[0] = map1;
//       mapMap1[1] = map2;
//       mapMap1[2] = map3;
//        //System.out.println(mapMap1[0]+" "+mapMap1[1]);
//
////        mapMap.entrySet().stream().filter(Val -> Val.getValue().entrySet().stream().
////                anyMatch(childVal -> childVal.getValue() > 10)).forEach(System.out::println);
//
//         Arrays.stream(mapMap1).filter(val->val.keySet().stream().anyMatch(val1 -> val1 == "age")).forEach(System.out::println);



    }
}
