package rXJavaPackage.ErrorHandling;

import io.reactivex.Observable;

import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex2 {
    public static void main(String[] args) {

      //  try {

            Observable.fromCallable(()->new FileReader("C:\\test\\a.txt"))
                    .subscribe(System.out::println,
                            throwable -> System.out.println("Error " + throwable));
       // }catch (Exception e){}
    }
}
