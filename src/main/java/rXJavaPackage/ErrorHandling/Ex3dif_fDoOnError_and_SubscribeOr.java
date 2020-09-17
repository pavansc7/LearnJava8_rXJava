package rXJavaPackage.ErrorHandling;

import io.reactivex.Observable;

public class Ex3dif_fDoOnError_and_SubscribeOr {
    public static void main(String[] args) {

         Observable.just(1,Integer.valueOf("two"))
                .map(val->{ if(val==2)
                                throw new ArithmeticException();
                            return val;
                })
                .subscribe((val)->System.out.println("Success subscriber "+val),
                        (error)->System.out.println("Error subscriber "+error)
                        );

    }
}
