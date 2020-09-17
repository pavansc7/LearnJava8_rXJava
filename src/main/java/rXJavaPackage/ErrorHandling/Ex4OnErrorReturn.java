package rXJavaPackage.ErrorHandling;

import io.reactivex.Observable;
import io.reactivex.Single;

public class Ex4OnErrorReturn {
    public static void main(String[] args) {

        Observable.fromCallable(()->Integer.valueOf(23))
                .map(val->{
                    if(val!=23){
                        throw  new Exception(" I am dumb error");
                    }
                    return val;
                })

             //// .onErrorResumeNext(val->{
                  // return Observable.error(new RuntimeException());
//               // })
              //  .onErrorReturn(val->300)
           //   .onErrorReturnItem(200)
//                .doOnNext(System.out::println)
//               .doOnError(error-> { throw new ArrayIndexOutOfBoundsException();
////                    System.out.println(error);
////                    Observable.error(error);
//                })
//                 .onErrorResumeNext(val->{
//                 return Observable.error(new RuntimeException());
//               })
                .doOnNext(val->{

                    Observable.error(new ArithmeticException());
                    throw new Exception();


                })
                .doOnError(
                        val-> {
                            System.out.println("I am in failure" +
                                    "");
                            Observable.error(new ArithmeticException());
                        }
                )
                .subscribe(System.out::println,error->System.out.println("oberver error "+error));
    }
}
