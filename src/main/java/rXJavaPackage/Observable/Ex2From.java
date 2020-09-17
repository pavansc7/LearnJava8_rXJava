package rXJavaPackage.Observable;

import io.reactivex.Observable;
import io.reactivex.Single;


public class Ex2From {
    static long getTimeObject() {
        long timeInMillis = System.currentTimeMillis();
        return timeInMillis;
    }

    public static void main(String[] args) {

        Observable observable= Observable.fromCallable(()->getTimeObject());

        observable.subscribe((person)->{System.out.println(person);});

     observable.subscribe(System.out::println);

        Single single = Single.fromCallable(()->getTimeObject());
       // Single single = Single.just(getTimeObject());

       // single.subscribe(System.out::println);
        //single.subscribe(System.out::println);
    }
}
