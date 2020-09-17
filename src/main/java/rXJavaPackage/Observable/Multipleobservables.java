package rXJavaPackage.Observable;

import io.reactivex.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Multipleobservables {
    public static void main(String[] args) {
    String s;

       Observable.fromIterable(new ArrayList<>(Arrays.asList(1,2,3,4)))
               
               .flatMapSingle(v -> Single.just(v))
         .subscribe((val)->System.out.println(" I am from Observer "+ val.getClass()),throwable -> System.out.println(" i am error "+throwable));
    }
}
