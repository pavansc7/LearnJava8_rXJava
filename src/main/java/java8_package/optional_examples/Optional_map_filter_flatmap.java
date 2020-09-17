package java8_package.optional_examples;

import java8_package.Person.GetPersonList;
import java8_package.Person.Person;

import java.util.Optional;

public class Optional_map_filter_flatmap {
    public static void main(String[] args) {

        Optional<Person> optionalPerson = Optional.ofNullable(GetPersonList.getSinglePerson());

         Person person1= optionalPerson.filter(person ->{ return person.getName()!="Pavan1"; }).orElseThrow(()->new ArithmeticException());

        //System.out.println(person1.isPresent() ? person1.get() : "null");
    }
}
