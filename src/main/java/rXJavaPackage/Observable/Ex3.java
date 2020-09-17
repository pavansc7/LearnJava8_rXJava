package rXJavaPackage.Observable;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java8_package.Person.GetPersonList;

import static java.lang.Thread.sleep;

public class Ex3 {

    static Single getSingle(){
        return Single.fromCallable(GetPersonList::getList)
                .doOnSuccess(list-> {
                   // System.out.println(list);
                    System.out.println(" I am here");
                    //Single.just("val").subscribe(System.out::println);
                }).compose(val->{return val;});
    }
    public static void main(String[] args) throws InterruptedException {

        Single.just(5)
               //.map(val->val)
                .flatMap(val->{ return Single.fromCallable(Ex3::getSingle); })
                //.flatMap(val->{ return Single.just(20);})
                //.flatMap(val->val)
               // .flatMap(val1->val1)
             //   .map(val->val)

                //.subscribe();
              .subscribe(val->{System.out.println(val); val.subscribe(System.out::println);},System.out::println);
//
//        Single single = Ex3.getSingle();
//        single.subscribe(System.out::println);
    }
}
