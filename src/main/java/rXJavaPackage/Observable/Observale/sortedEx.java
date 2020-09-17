package rXJavaPackage.Observable.Observale;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.util.Arrays;

public class sortedEx
{
    public static void main(String[] args) {
        Observer ob = new Observer() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onNext(Object o) {
                    System.out.println(o);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        };
        Observable<String> stringObservable = Observable.fromIterable(Arrays.asList("Pavan","kumar","pavan"));
      stringObservable.filter(val-> !val.equals("kumar")).sorted();
       Disposable d = stringObservable.subscribe(System.out::println);
       d.dispose();
    }
}
