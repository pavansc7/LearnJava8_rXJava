package java8_package.optional_examples;

import java8_package.Person.GetPersonList;
import java8_package.Person.Person;

import java.util.Optional;

public class Optional_all_types {
    public static void main(String[] args){
        Optional<Person> person = Optional.ofNullable(GetPersonList.getSinglePerson());
        Optional<Person> person1 = Optional.ofNullable(null);

       // System.out.println(person1.orElse(new Person("pk",null,'\0')));
        String nme = person.get().getName();

        String name = person1.map(val->val.getName()).orElseThrow(() -> new RuntimeException()) ; //.orElseThrow(()->new Exception() );
        System.out.println(name);
    }
}
