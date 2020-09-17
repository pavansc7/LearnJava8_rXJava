package rXJavaPackage.Observable;


import io.reactivex.*;
import io.reactivex.disposables.Disposable;

public class Ex1 {
    public static void main(String[] args) {


        Single single = Single.fromCallable(()->new RuntimeException())
                .doOnSuccess((val)->{
                    if (false){
                        throw new ArrayIndexOutOfBoundsException();
                    }
                })
         //   .onErrorReturn(()
           //  .onErrorResumeNext((error)->Single.error(new ArithmeticException("Pk")))
                .doOnSuccess((val)->System.out.println(" Hi I am second value "+val))
                .doOnError((error)->{
                    System.out.println("Failed");
                });

                single.subscribe((success)-> System.out.println("Successful "+success ),(error)-> System.out.println("Error "+error));

        SingleObserver singleObserver = new SingleObserver() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onSuccess(Object o) {

            }

            @Override
            public void onError(Throwable throwable) {

            }
        };
                single.subscribe(singleObserver);
    }
}
