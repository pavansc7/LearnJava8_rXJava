 package rXJavaPackage.single_completable;

import io.reactivex.Completable;
import io.reactivex.Single;
import java8_package.Person.GetPersonList;
import java8_package.Person.Person;

import java.util.ArrayList;

 public class SingleCompletable {
    static Single getSingle(){
        return Single.fromCallable(GetPersonList::getList)
                .doOnSuccess(list-> {
                    System.out.println(list);
                    Single.just("val").subscribe(System.out::println);
                });
    }

    public static void main(String[] args) {

        Completable single = Single.just(new Person("pavan","add",'M'))
                //.map(person -> person.getVal(5))
                .doOnSuccess(person -> System.out.println("Successfully got Person "+person))
                .doOnError((error)->System.out.println("Got error "+error.getLocalizedMessage()))
             //   .cast(List.class)
                .flatMapCompletable(person -> { return getSingle().flatMapCompletable(person1->{

                            //if ((( ArrayList) person1).get(0) ==null) {
                    if(true){
                                System.out.println("I am person 1 "+(( ArrayList) person1).get(0));
                                return Completable.complete();
                            }
                            return Completable.error(new Exception("I am flatmap 2"));
        }); } );
//                    System.out.println("I am inside flatMapBlock");
//                    return Completable.complete();  );

        single.subscribe(()->System.out.println("Success"),System.out::println);
    }
}
