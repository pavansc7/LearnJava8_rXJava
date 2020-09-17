package rXJavaPackage.map_flatMap;

import io.reactivex.Completable;
import io.reactivex.Single;
import java8_package.Person.Person;

public class maptofaltMapCompletable {
    static Single<String> get(){
       //return Single.just(new Person("ki",null,'\0'));
      // return Single.fromCallable(()->{throw new Exception("EEEEEx");});
        return Single.just("null");
    }
    public static void main(String[] args) {

        Single.just(new Person("pavan",null,'\0'))
                .map(person -> {
                    if(person.getName().isEmpty())
                       return Completable.error(new Exception("invalid name"));

                    return person;
                })
                .flatMap(Single::just)
                .flatMap(Single::just)
               // .cast(String.class)
                .flatMap(name->
                    get().doOnSuccess(val->System.out.println(val)).flatMap(val->Single.just(val))
                   // return Completable.complete();
                )
                .subscribe(System.out::println,System.out::println);
    }
}
