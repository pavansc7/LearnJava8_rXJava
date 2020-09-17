package java8_package.Person;

import java.util.ArrayList;
import java.util.List;

public class GetPersonList<T>{
    static List<Person> list = new ArrayList();

    static void addPerson(){
        list.add(new Person("Pavan1","Add1",'M'));
        list.add(new Person("Pavan2","Add1",'M'));
        list.add(new Person("Pavan3","Add1",'M'));
        list.add(new Person("Pavan4","Add1",'M'));

        list.add(new Person("pk1","aaa",'F'));
        list.add(new Person("Pk2","aaa",'F'));
        list.add(new Person("Pk3","aaa",'F'));

    }
    public static List getList(){
        addPerson();
       return list;
    }

    public static Person getSinglePerson(){
        //return Optional.ofNullable(new Person("Pavan1", null, 'M'));
        //return Optional.ofNullable(null);
        return new Person("Pavan1", null, 'M');
    }

}
