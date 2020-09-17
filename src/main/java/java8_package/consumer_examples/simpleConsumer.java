package java8_package.consumer_examples;

import java8_package.Person.GetPersonList;
import java8_package.Person.Person;

import java.util.List;

public class simpleConsumer {
    public static void main(String[] args) {
//        Consumer consumer1 = str -> System.out.println(str.toString().toLowerCase());
//      //  consumer.accept(new String("I am Pavan"));
//        Consumer consumer2 = str -> System.out.println(str.toString().toUpperCase());
//        Consumer consumer3  = consumer2.andThen(consumer1).andThen(consumer2);
//        consumer3 = consumer3.andThen(consumer3);
//        consumer3.accept("Pavan");
        List<Person> list = GetPersonList.getList();
        System.out.println(list.get(0));

        String name = "pavankumar";
        String name_1 = "\"PavanKumar\"";

        System.out.println(name+"  "+name_1);
    }
}
