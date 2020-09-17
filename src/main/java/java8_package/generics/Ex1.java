package java8_package.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        Operation operation = new Operation<>();
        List<String> list1 = Arrays.asList("1,2,3");
        List list2 = Arrays.asList(4,5,6);

        System.out.println(operation.add(list1,list2).get(0));
    }


}


class Operation<T>{

    public  List<Integer> add(List<T> list1,List<T> list2 ){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int val;
               for(int i=0;i<list1.size() || i<list2.size();i++){
                   val=(int)list1.get(i)+(int)list2.get(i);
                    arrayList.add(val);
               }
                 return arrayList;
    }
}