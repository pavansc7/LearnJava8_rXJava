package Collections.TreeMapEx;

import java8_package.Person.Person;

import java.util.TreeMap;

import static java.util.Collections.sort;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Person,String> treeMap = new TreeMap<>();
        treeMap.put(new Person("pavan",null,'\0'),"pavan");
        treeMap.put(new Person("kumar",null,'\0'),"kumar");
       // tr
        treeMap.forEach((k,v)->System.out.println(k+" "+v));
    }
}
