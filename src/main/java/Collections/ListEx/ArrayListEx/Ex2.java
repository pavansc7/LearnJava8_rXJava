package Collections.ListEx.ArrayListEx;

import java8_package.Person.Person;

import java.util.Collections;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        Person p1 = new Person(1,"pavan","shiv",'M');
        Person p2 = new Person(1,"pavan","shiv",'M');
        p2 = p1;
        Person p3 = new Person(1,"pavan","shiv",'M');

        System.out.println(p1.hashCode() + " "+ p3.hashCode());
    }
}
