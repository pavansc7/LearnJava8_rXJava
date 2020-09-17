package rXJavaPackage.ErrorHandling;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex1 {
    public static void main(String[] args) {
//        Observable.just(1,2,3,null)// .map(ign -> null)
//                .subscribe(System.out::println,err -> System.out.println("Error me "+err.getMessage()));

        Single.just(2)  .doOnSuccess(ign -> {
            if(ign == 2)
            throw new Error();
        })
               .onErrorResumeNext(error-> {
                            System.out.println("I am in onErrorReturn Next");
                           return Single.error(new Exception("I am error"));
                            //  return Single.just(10);
                        }
                )
                .map(val->{
                    System.out.println(" I am in Map "+val);
                    return val;
                })
                .subscribe(System.out::println,err -> System.out.println("Error Occurred "+err.getLocalizedMessage()));


    }
}
