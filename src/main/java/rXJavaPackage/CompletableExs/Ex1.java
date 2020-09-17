package rXJavaPackage.CompletableExs;

import io.reactivex.Completable;
import io.reactivex.Single;

public class Ex1 {
    public static void main(String[] args) {
        Completable completable = Single.just("value")
                .flatMapCompletable(val->{
                    System.out.println(val);
                    Completable.error(new Exception());
                    return Completable.complete();
                }).doOnComplete(()->System.out.println(" I am completed "));

                completable.subscribe();
    }
}
