package Collections.ListEx.ArrayListEx;

import java8_package.Person.GetPersonList;
import java8_package.Person.Person;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        //Add integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0,3);
        list.addAll(Arrays.asList(2,3,4,78,4,1));
        list.sort(Integer::compareTo);
        int tmp;
        for(int i=0,j=list.size()-1;i <= j;i++,j--){
            tmp=list.get(j);
            list.set(j,list.get(i));
            list.set(i,tmp);
        }
        // list.sort((val1,val2)->val2-val1);
       // Collections.sort(list);
        list.forEach(System.out::println);
        
        //Add Person

//        List<Person> personArrayList = (List<Person>)GetPersonList.getList();
//        personArrayList.sort(Comparator.comparingInt(Person::getId));
//        personArrayList.forEach(System.out::println);
    }
}
